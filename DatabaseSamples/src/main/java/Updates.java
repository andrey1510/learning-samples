/* To update data in a table in a PostgreSQL database:
    1. Create a database connection.
    2. Create a PreparedStatement object.
    3. Execute the UPDATE statement by calling the executeUpdate() method of the PreparedStatement object.
    4. Close the database connection.
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updates {

    public static void updateEmail(int customer_id, boolean activebool) { //parameters (if input is required)

        String SQL = "UPDATE customer SET activebool = ? WHERE customer_id = ?";

        try (Connection conn = Connector.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setBoolean(1, activebool);
            pstmt.setInt(2, customer_id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
