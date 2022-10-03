package Operations.Collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


//////////////////////////////////// Stream Creation //////////////////////////

public class StreamSamples {


    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 5, 24, 3, 90, 99, 101, 44, 3, 8, -2, 77, 0, -25, 1, 2, 3, 86, 105));
        numbers1.stream()  // numbers1 - источник данных, к которому производится запрос
                // Intermediate Operations - operations used to pipeline other methods
                .filter(e -> (e >= -24))   //  produces a filtered stream whose elements evaluate to true for the specified predicate
                .peek(e -> System.out.print(e + " "))  // pick may be used to look how Intermediate Operations work
                .filter(e -> (e > -1) && (e < 100))
                .skip(1)    // will skip indicated number of elements from the beginning
                .limit(15)  // will cut elements exceeding the limit
                .distinct() // удаление дубликатов
                .sorted()   // сортировка
                .takeWhile(e -> (e<92)) //срез потока c помощью предиката, прекращает работу сразу же по обнаружении неподходящего элемента
                .dropWhile(e -> (e<1)) // срез потока, отбрасывает первые элементы, для которых предикат ложен
                .map(e -> e*2)  // map operation applies a function to each element to produce another stream
                // Terminal Operation
                .forEach(System.out::println);  // Потребляет все элементы из потока данных, применяя к каждому из них заданное лямбда-выражение
    }
}

/////////////////////////////////////  Operations - Collector ////////////////////////////////////

class Operations2 {

    static List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 0, 44, 3, 8));

    public static void main(String[] args) {

        List<Integer> processedNumbers2 = numbers2.stream()
                // Intermediate Operations
                .distinct()
                .sorted()
                // Terminal Operation
                .collect(toList());

        System.out.println(processedNumbers2);
    }
}

class Operations3 {
    static List<Integer> numbers3 = new ArrayList<>(Arrays.asList(2, 2, 11, 3, 0, 44, 3, 8));

    public static void main(String[] args) {

        long numbers1Quantity = numbers3.stream()
                // Intermediate Operation
                .distinct()
                // Terminal Operation
                .count();           // counting quantity of elements

        System.out.println(numbers1Quantity);
    }

}

/////////////////////////////// Operations - Search ///////////////////////////////////////

