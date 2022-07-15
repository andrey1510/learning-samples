import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* To delete data:
    1. Establish a database connection.
    2. Create a PreparedStatement object.
    3. Execute a DELETE statement.
    4. Close the database connection.
*/

public class Deletes {

    public static void deleteActor(int id) {
        String SQL = "DELETE FROM actor WHERE actor_id = ?";

        try (Connection conn = Connector.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
