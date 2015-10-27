import java.sql.*;

/**
 * Created by trant on 10/25/2015.
 */
public class TestConnection {
    public static Connection getConnection() throws ClassNotFoundException{
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "asdfghjkl");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection connection = getConnection();
}
