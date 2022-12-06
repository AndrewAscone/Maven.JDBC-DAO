import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/GratefulDead";
    public static final String USER = "testuser";
    public static final String PASS = "testpass";

    public static Connection getConnection() {
        try{
            DriverManager.registerDriver(new Driver());
            System.out.println("Connecting to database . . .");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
        System.out.println("Successfully connected to database!");
    }
}
