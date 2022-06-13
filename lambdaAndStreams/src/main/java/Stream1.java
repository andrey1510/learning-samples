import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream1 {

    List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 11, 3, 5, 24, 101, 44, 3, 8));
    Stream<Integer> streamNumbers1 = numbers1.stream();  // creation of stream from collection

    Stream<String> streamFromValues = Stream.of("a", "b", "c");  // creation of stream from values

    Integer[] arr1 = { 11, 3, 5, 24, 101};
    Stream<Integer> streamFromArrays = Arrays.stream(arr1);   // creation of stream from array


    public static void main(String[] args) {
       Stream.builder().add("a1").add("a2").add("a3").build();
    }



}


