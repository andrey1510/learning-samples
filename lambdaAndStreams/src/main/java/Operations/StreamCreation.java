package Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        Stream<String> streamOf1  = Stream.of("Stream");   // of() method creates a stream from a single value
        streamOf1.forEach(System.out::println);

        Stream<String> streamOf2  = Stream.of("A","B","C");  // of() method creates a stream from multiple values
        streamOf2.forEach(System.out::println);

        String[] colorsArray = new String[] {"Orange", "Blue", "Green", "Yellow"};   // of() method creates a stream from array
        Stream<String> streamOfArray = Stream.of(colorsArray);
        streamOfArray.forEach(System.out::println);

        Integer[] arr1 = { 11, 3, 5, 24, 101};
        Stream<Integer> streamFromArrays = Arrays.stream(arr1);   // creation of stream from array with stream(method)

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 11, 3, 5, 24, 3, 101, 44, 3, 8, -1, 77, 0, -25));
        Stream<Integer> streamNumbers1 = numbers1.stream();  // creation of stream from collection using stream() method

        Stream<String> streamBuilder  = Stream.<String>builder()      // Creation of stream via builder
                .add("A")
                .add("B")
                .add("C")
                .build();
        streamBuilder.forEach(System.out::println);

        LongStream longStream1 = LongStream.range(1, 3);   // includes numbers from 1 to 3 excluding the last number (3)
        longStream1.forEach(System.out::println);
        LongStream longStream2 = LongStream.rangeClosed(1, 3);   // includes numbers from 1 to 3 including the last number (3)
        longStream2.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();    // Creation of empty stream
        emptyStream.forEach(System.out::println);





    }


}
