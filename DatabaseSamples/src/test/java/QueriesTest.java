import org.junit.jupiter.api.Test;

public class QueriesTest {

    @Test
    public void test1() {
        Queries.getCustomer1();
    }

    @Test
    public void test2() {
        Queries.getCustomer2();
    }

    @Test
    public void test3() {
        Queries.getCustomer3(2);
    }

    @Test
    public void test4() {
        Queries.getCustomer4();
    }

    @Test
    public void getFilmsTest() {
        Queries.getFilms("%er",2006);
    }

}
