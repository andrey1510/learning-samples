import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Establishing a database connection to the PostgreSQL server:

public class Connector {

    // Provide account information (username, password, connection string):
    // format of connection string shall be following: jdbc:postgresql://<database_host>:<port>/<database_name>
    private static final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private static final String user = "postgres";
    private static final String password = "tbs666V";
    //private static final String DriverClass = org.postgresql.Driver;    // required only if IDE doesn't contain the Driver class
    //

    // getConnection() method of the DriverManager class shall return a Connection object
    public static Connection connect() throws SQLException {
        //Class.forName(DriverClass);       // required only if IDE doesn't contain the Driver class
        return DriverManager.getConnection(url, user, password);
    }

}
