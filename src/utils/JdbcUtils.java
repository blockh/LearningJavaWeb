package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Blockhead
 * 2018/10/26 17:12
 *
 * version v1.0
 *
 */
public class JdbcUtils {
    private static Properties properties;
    //只在jdbcUtils第一次创建的时候被创建
    static {
        /*
         * 为了防止多次获取Connection是前部分代码多次创建，会影响效率，使用静态代码块，=，来提升效率
         *
         */
        //加载配置文件
        InputStream in = JdbcUtils.class
                .getClassLoader().getResourceAsStream("jdbc_mysql.properties");
        properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //加载驱动类
        try {
            Class.forName(properties.getProperty("driverClassName"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 1.加载配置文件
     * 2.加载驱动类
     * 3.调用DriverManager.getConnection
     *
     * @return 获取Connection
     */
    public static Connection getConnection() throws Exception {
        //返回Connection
        return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));

    }
}
