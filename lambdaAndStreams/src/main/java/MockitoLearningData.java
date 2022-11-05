import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MockitoLearningData {

    private final List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 13));

    public List<Integer> getNumbers() {
        return numbers;
    }

}
