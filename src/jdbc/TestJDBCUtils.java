package jdbc;

import org.junit.Test;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Blockhead
 * 2018/10/26 17:33
 */
public class TestJDBCUtils {
    @Test
    public void testGetConnection(){
        try {
            Connection connection = JdbcUtils.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigpig");
            while (resultSet.next()){
                int pig_id = resultSet.getInt(1);
                String pig_name = resultSet.getString("pig_name");
                String pig_age = resultSet.getString("pig_age");
                Date pig_birth = resultSet.getDate(4);
                System.out.println(pig_id + "\t" + pig_name + "\t" + pig_age + "\t" + pig_birth);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
