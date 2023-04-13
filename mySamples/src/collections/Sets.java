package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Sets {

    int[] arr1 = new int[] {8, 6, 2};


    /// Array to set ///

    Set<Integer> bSet = Arrays.stream(arr1).boxed()
            .collect(Collectors.toSet());

}
