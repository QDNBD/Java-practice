//import com.mysql.jdbc.Driver;

import sun.net.TelnetProtocolException;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException

    {
        //1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        // cmd mysql -u root -p
        String ur1 = "jdbc:mysql://127.0.0.1:3306/java20_20191218?useSSL=false";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                ur1,
                username,
                password
        );

        //3获取语句statment
        Statement statement = connection.createStatement();

        //执行语句
        String sql = "SELECT DATABASE()";
        ResultSet resultSet = statement.executeQuery(sql);
        //事先知道只有一行或一列
        resultSet.next();//调一次next才执行第一句
        String name = resultSet.getString(1);//第一列从1开始
        System.out.println(name);

        //关闭结果集resultSet（）
        resultSet.close();

        sql = "SELECT id,username FROM users ORDER BY id";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String user = resultSet.getString(2);
            System.out.println(id + "," + user);
        }
        resultSet.close();


        //关闭语句
        statement.close();
        //关闭连接
        connection.close();

    }
}
