import org.junit.jupiter.api.Test;

public class TransactionsTest {
    Transactions t = new Transactions();

    @Test
    public void setActiveTest() {
        t.setActive(14, false);
    }

}
