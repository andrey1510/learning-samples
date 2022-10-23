
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockitoLearning {

    MockitoLearningData mockitoLearningData = new MockitoLearningData();

    public Integer printSumOfUniques() {

        return mockitoLearningData.getNumbers().stream()
                .distinct()
                .reduce(0, Integer::sum);
    }

}
