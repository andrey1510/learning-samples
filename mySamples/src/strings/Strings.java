package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Strings {

    String[] arr = new String[]{"a", "b", "c"};


    /// Array to String ///

    String s1 = String.join("", arr);

    String s2 = Arrays.stream(arr)
            .collect(Collectors.joining());

}
