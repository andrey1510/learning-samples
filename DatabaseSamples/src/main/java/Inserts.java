
/* To insert a row into a table:
    1. Establish a database connection to get a Connection object.
    2. Create a Statement object from the Connection object.
    3. Execute the INSERT statement.
    4. Close the database connection.
*/

import java.sql.*;

public class Inserts {

    public static void insertActor() {
        String SQL = "INSERT INTO actor(first_name,last_name) "
                + "VALUES(?,?)";
        long id = 0;
        try (Connection conn = Connector.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, "Jane");
            pstmt.setString(2, "Doe");

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
