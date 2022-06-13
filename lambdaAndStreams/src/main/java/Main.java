
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Data.entities()
                .stream()
                .filter(price -> price.getPrice() > 100)
                .filter(id -> id.getId() <= 4)
                .map(Data::getTitle)
                .forEach(System.out::println);
    }
}
class Data {

    private int id;
    private String title;
    private int price;

    public Data(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<Data> entities () {
        Data e1 = new Data(1, "asd", 110);
        Data e2 = new Data(2, "vbnsj", 55);
        Data e3 = new Data(3, "trf", 34);
        Data e4 = new Data(4, "nmb", 1158);
        Data e5 = new Data(5, "desakl", 15);
        return Arrays.asList(e1, e2, e3, e4, e5);
    }
}

