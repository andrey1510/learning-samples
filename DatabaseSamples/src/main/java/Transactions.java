import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transactions {

    private Transactions close(AutoCloseable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    public void setActive(int customer_id, boolean activebool) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String SQL = "UPDATE customer SET activebool = ? WHERE customer_id = ?";

        try {
            conn = Connector.connect();
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(SQL);
            pstmt.setBoolean(1, activebool);
            pstmt.setInt(2, customer_id);
            pstmt.executeUpdate();

            conn.commit();
            // conn.rollback();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            this.close(rs).close(pstmt).close(conn);
        }
    }
}
