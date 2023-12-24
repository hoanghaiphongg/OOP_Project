import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnotherDatabaseReader implements DataReader {
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/another_database";
    private static final String MYSQL_USER = "another_username";
    private static final String MYSQL_PASSWORD = "another_password";

    private static Connection connection = null;

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Use the appropriate MySQL driver class
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("Connected to MySQL database");
        }
        return connection;
    }

    // Add other MySQL database operations if needed
}
