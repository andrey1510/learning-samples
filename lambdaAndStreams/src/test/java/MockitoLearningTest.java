import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoLearningTest {
    @Mock
    private MockitoLearningData mockData;

    @Test
    public void printSumOfUniquesTest() {

        List<Integer> testList = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 0, 44, 3, 8));

        MockitoLearning mockitoLearning = new MockitoLearning();

        Mockito.lenient().when(mockData.getNumbers()).thenReturn(testList);

        assertEquals(29, mockitoLearning.printSumOfUniques());
    }
}
