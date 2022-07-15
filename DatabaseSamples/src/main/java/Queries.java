import org.junit.jupiter.api.Test;

import java.sql.*;

/* To query data from a table using JDBC the following steps are required:
    1. Establish a database connection to the PostgreSQL server.
    2. Create an instance of the Statement object
    3. Execute a statement to get a ResultSet object
    4. Process the ResultSet object.
    5. Close the database connection.
*/

public class Queries {

    ////////////////////// Query with Statement //////////////////////
    // use the Statement to implement a simple SQL statement that has no parameters.

    public static void getCustomer1() {
        String SQL = "SELECT first_name, last_name FROM customer WHERE activebool = true";  // String with SQL query

        // Creating connection:
        try (Connection conn = Connector.connect();    // try-catch is necessary
             // Creating instance of Statement:
             Statement stmt = conn.createStatement();
             // Executing the Statement object (with SQL string) to get a ResultSet object that represents a database result set:
             ResultSet rs = stmt.executeQuery(SQL)) {       // executeQuery: returns only one ResultSet object.
            // Processing the ResultSet object:
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + "\t" + rs.getString("last_name") + "\t");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////// Query with PreparedStatement //////////////////////
    // PreparedStatement gives  the ability to add the parameters to the SQL statements.
    // PreparedStatement is used when you want to use SQL statements many times.

    public static void getCustomer2() {
        // String with SQL query with placeholders (?):
        String SQL = "SELECT first_name,last_name FROM customer WHERE activebool = ? AND last_name LIKE ?";
        // Creating connection:
        try (Connection conn = Connector.connect();
             // Creating instance of PreparedStatement with SQL string:
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            // Using setInt(), setString(), etc methods to pass the value to the placeholders:
            pstmt.setBoolean(1, true);
            pstmt.setString(2, "Smith");
            // Executing the PreparedStatement object to get a ResultSet object
            ResultSet rs = pstmt.executeQuery();
            // Processing the ResultSet object:
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + "\t" + rs.getString("last_name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////// Query with PreparedStatement with input //////////////////////
    // PreparedStatement interface accepts input parameters at runtime.

    public static void getCustomer3(int customer_id) {  //input parameter
        // String with SQL query with placeholders (?):
        String SQL = "SELECT first_name,last_name FROM customer WHERE customer_id = ?";

        try (Connection conn = Connector.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            // Using setInt(), setString(), etc methods to pass the value to the placeholders:
            pstmt.setInt(1, customer_id);       //input parameter
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + "\t" + rs.getString("last_name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////// Query with CallableStatement //////////////////////
    // Used to call the stored procedures (functions).

    // Functions:

    static String createFunction = "CREATE OR REPLACE FUNCTION func(p1 TEXT) RETURNS TEXT "
            + " AS $$ "
            + " BEGIN "
            + " RETURN '111 ' || p1; "
            + " END; "
            + " $$ "
            + " LANGUAGE plpgsql";
    static String runFunction = "{ ? = call func( ? ) }";


    public static void getCustomer4() {

        try (Connection conn = Connector.connect();
             Statement statement = conn.createStatement();
             CallableStatement callableStatement = conn.prepareCall(runFunction)) {
            statement.execute(createFunction);
            callableStatement.registerOutParameter(1, Types.VARCHAR);
            callableStatement.setString(2, "222");
            callableStatement.executeUpdate();
            String result = callableStatement.getString(1);
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////// Query with CallableStatement (function in database) //////////////////////

    public static void getFilms(String pattern, int releaseYear) {

        String SQL = "SELECT * FROM get_film (?, ?)";       // call to function get_film in database
        try (Connection conn = Connector.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1,pattern);
            pstmt.setInt(2,releaseYear);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(String.format("%s %d",
                        rs.getString("film_title"),
                        rs.getInt("film_release_year")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
