import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountWords {
    private static final String statement = "Карл украл у Клары кораллы Карл украл украл";
    public static void main(String[] args) {
        String[] words = statement.split(" ");
        var result = Arrays.stream(words).collect(Collectors.groupingBy(e -> e, Collectors.counting() ));
        System.out.println(result);

    }
}
