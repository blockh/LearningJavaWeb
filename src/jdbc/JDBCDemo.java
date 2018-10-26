package jdbc;

import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * @author Blockhead
 * 2018/10/23 20:49
 * 连接数据库，得到Connection就算成功
 */
public class JDBCDemo {
    /**
     * /*
     * 得到connection
     *
     *
     * 1.准备四大参数
     * 2.加载驱动类
     * 3.得到Connection
     */
    @Test
    public void getConnection() throws ClassNotFoundException, SQLException {

        /*
         * 1.准备四大参数：
         */
        String driverClassName = "com.mysql.jdbc.Driver";

        /*
         * jdbc协议格式：jdbc:厂商的名称:子协议（由厂商自己来规定）
         * 对mysql而言，他的子协议结构为：//主机:端口号/数据库名称
         */
        String url = "jdbc:mysql://localhost:3306/pigpig";
        String username = "root";
        String password = "safe2017";

        //2.加载驱动类
        Class.forName(driverClassName);

        //3.使用DriverManager，以及剩下的三个参数来得到Connection
        Connection connection = DriverManager.getConnection(url,username,password);


        /*
         * 对数据库做增删改
         * 1.connection对象创建Statement
         *      >Statement,他的功能就是向数据库发送SQL语句！
         * 2.调用他的int executeUpdate(String sql),他可以发送DML(增删改)和DDL（对表接口进行修改）
         */
        //1.通过connection对象创建Statement对象
        Statement statement = connection.createStatement();
        //2.使用statement发送sql语句
        String sql = "INSERT INTO bigpig VALUES('6','刘国平',20,'1998.05.01')";
        int r = statement.executeUpdate(sql);
        System.out.println(r);

        statement.close();
        connection.close();
    }


    /**
     * 执行查询
     */
    @Test
    public void executeSelect() throws ClassNotFoundException, SQLException {
        /*
            1.得到Connection
            2.使用Statement，发送select语句
            3.对查询出来的数据进行解析
         */

        /*
            一、得到连接
            1.准备四大连接参数
         */
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pigpig";
        String username = "root";
        String password = "safe2017";

        /*
            2.加载驱动类
         */
        Class.forName(driverClassName);

        /*
            3.获取connection
         */
        Connection conn = DriverManager.getConnection(url,username,password);

        /*
            二、通过connection对象获取statement对象，然后执行查询语句
            1.得到statement
         */
        Statement statement = conn.createStatement();

        //2.查询
        String sql = "SELECT * FROM bigpig";
        ResultSet resultSet = statement.executeQuery(sql);

        //3.解析ResultSet
        System.out.println("pig_id\tpig_name\tpig_age\tpig_birth");
        while (resultSet.next()){
            //第一列，编号，通过列号来获取
            int pig_id = resultSet.getInt(1);
            //第二列，姓名，使用字段名来查询
            String pig_name = resultSet.getString("pig_name");
            //第三列，年龄，使用字段名来查询
            String pig_age = resultSet.getString("pig_age");
            Date pig_birth = resultSet.getDate(4);

            System.out.println(pig_id + "\t" + pig_name + "\t" + pig_age + "\t" + pig_birth);

        }

        resultSet.close();
        statement.close();
        conn.close();
    }

    /**
     * 规范化关闭流
     */
    @Test
    public void query(){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/pigpig";
            String username = "root";
            String password = "safe2017";
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url,username,password);
            stmt = con.createStatement();
            String sql = "SELECT * FROM bigpig";
            rs = stmt.executeQuery(sql);

            //光标移动到最后一行，获取当前行是第几行
            rs.last();
            //获取当前行数
            System.out.println("共搜索到" + rs.getRow() + "个结果");
            //回到第一行
            rs.beforeFirst();


            System.out.println("pig_id\tpig_name\tpig_age\tpig_birth");
            while (rs.next()){
                //第一列，编号，通过列号来获取
                int pig_id = rs.getInt(1);
                //第二列，姓名，使用字段名来查询
                String pig_name = rs.getString("pig_name");
                //第三列，年龄，使用字段名来查询
                String pig_age = rs.getString("pig_age");
                Date pig_birth = rs.getDate(4);

                System.out.println(pig_id + "\t" + pig_name + "\t" + pig_age + "\t" + pig_birth);

            }
            //TODO 在这里进行初始化参数，和查询，并拿到ResultSet处理
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            try{
                if(rs != null) {
                    rs.close();
                }
                if(stmt != null) {
                    stmt.close();
                }
                if(con != null) {
                    con.close();
                }

            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }




}
