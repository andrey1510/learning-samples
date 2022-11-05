package Operations.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayLists {

    List<Integer> numbers = new ArrayList<> (Arrays.asList(1, 2, 3, 10, 13));
    List<String> colors1 = new ArrayList<> (Arrays.asList("Orange", "Blue", "Green", "Yellow"));
    List<String> colors2 = new ArrayList<> (Arrays.asList("Orange", "White", "Yellow", "Cyan"));

    int a = 1;
    int b = 2;
    int c = 3;
    List<Integer> t = Stream.of(a, b, c).sorted().collect(Collectors.toList());     // init and operations with list

    public static void main(String[] args) {
        ArrayLists t = new ArrayLists();

        // removeIf for array list
        t.numbers.removeIf(n -> (n < 8));   // removing elements on condition

        // Iterator for array list sample (forEach, lambda)):
        t.colors1.forEach(System.out::println);

        // Iterator for array list sample (forEach, stream)):
        t.colors1.stream().forEach((n) -> System.out.println(n));

    }

    // List creation with filtration
    String str = "ab45ad8b4";
    List<String> list = Arrays.stream(str.split(""))
            .filter(e -> e.equals("(") || e.equals(")"))
            .collect(Collectors.toList());

    ///////////////// Conversions ///////////////

    // Array to list:

    int[] numbersArr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List <Integer> strings = Arrays.stream(numbersArr)
            .boxed()
            .collect(Collectors.toList());

    // Integer list to string list:

    List<Integer> numbersIntegers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    List<String> numbersStrings = numbersIntegers.stream()
            .map(Object::toString)
            .collect(Collectors.toList());

}
