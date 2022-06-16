import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


//////////////////////////////////// Stream Creation //////////////////////////

public class StreamSamples {

    List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 11, 3, 5, 24, 3, 101, 44, 3, 8, -1, 77, 0, -25));
    Stream<Integer> streamNumbers1 = numbers1.stream();  // creation of stream from collection

    Stream<String> streamFromValues = Stream.of("a", "b", "c");  // creation of stream from values

    Integer[] arr1 = { 11, 3, 5, 24, 101};
    Stream<Integer> streamFromArrays = Arrays.stream(arr1);   // creation of stream from array


    public static void main(String[] args) {        // creation of stream with builder
       Stream.builder().add("a1").add("a2").add("a3").build();
    }
}

///////////////////////////////////// Operations - filters, sorting, mapping //////////////////////////
// todo - sout
class Operations {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 5, 24, 3, 90, 99, 101, 44, 3, 8, -2, 77, 0, -25, 1, 2, 3, 86, 105));
        numbers1.stream()  // numbers1 - источник данных, к которому производится запрос
                // Intermediate Operations - operations used to pipeline other methods
                .filter(n -> (n >= -24))   //  produces a filtered stream whose elements evaluate to true for the specified predicate
                .filter(n -> (n > -1) && (n < 100))
                .skip(1)    // will skip indicated number of elements from the beginning
                .limit(15)  // will cut elements exceeding the limit
                .distinct() // удаление дубликатов
                .sorted()   // сортировка
                .takeWhile(n -> (n<92)) //срез потока c помощью предиката, прекращает работу сразу же по обнаружении неподходящего элемента
                .dropWhile(n -> (n<1)) // срез потока, отбрасывает первые элементы, для которых предикат ложен
                .map(n -> n*2)  // map operation applies a function to each element to produce another stream
                // Terminal Operation
                .forEach(System.out::println);  // Потребляет все элементы из потока данных, применяя к каждому из них заданное лямбда-выражение
    }
}

/////////////////////////////////////  Operations - Collector ////////////////////////////////////

class Operations2 {

    List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 0, 44, 3, 8));
    List<Integer> processedNumbers2 = numbers2.stream()
            // Intermediate Operations
            .distinct()
            .sorted()
            // Terminal Operation
            .collect(toList());

    public static void main(String[] args) {
        Operations2 t = new Operations2();
        System.out.println(t.processedNumbers2);
    }
}

class Operations3 {
    List<Integer> numbers3 = new ArrayList<>(Arrays.asList(2, 2, 11, 3, 0, 44, 3, 8));
    long numbers1Quantity = numbers3.stream()
            .distinct()
            .count();           // counting quantity of elements
    public static void main(String[] args) {
        Operations3 t = new Operations3();
        System.out.println(t.numbers1Quantity);
    }

}

/////////////////////////////// Operations - Search ///////////////////////////////////////

class Operations4 {
    List<Integer> numbers4 = new ArrayList<>(Arrays.asList(3, 0, 2, 105));

    boolean containsZero = numbers4.stream()
            .anyMatch(n -> n == 0);     // удовлетворяет ли заданному предикату хотя бы один элемент из потока данных

    boolean allMoreThanZero = numbers4.stream()
            .allMatch(n -> n > 0);      // проверяет, удовлетворяют ли заданному предикату все элементы потока данных

    boolean noZero = numbers4.stream()
            .noneMatch(n -> n == 0);   // проверяет, точно ли ни один элемент списка не соответствует заданному предикату
    //Optional<Integer>
    int smallestNonZero = numbers4.stream()
            .sorted()
            .filter(n -> n > 0)
            .findAny().get();     // возвращает первый элемент списка, целесообразно использовать с другими операциями
                                  // применяется Optional

    Optional<Integer> maxNumber4 = numbers4.stream().reduce(Integer::max);

    //Comparator<Integer> numbers4Comparator = Comparator.comparing(numbers4.get(1));

    //int minElement = numbers4.stream()
      //      .min().getAsInt();

    public static void main(String[] args) {
        Operations4 t = new Operations4();

        System.out.println("List contains zero: " + t.containsZero);
        System.out.println("All elements of the list is more than zero: " + t.allMoreThanZero);
        System.out.println("No element of the list is zero: " + t.noZero);
        System.out.println("Smallest non-zero number of the list is: " + t.smallestNonZero);
    }
}