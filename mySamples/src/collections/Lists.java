package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {

    String str1 = "ab45ad8b4";
    String str2 = "abc";
    List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 13));
    List<String> colorsList1 = new ArrayList<>(Arrays.asList("Orange", "Blue", "Green", "Yellow"));
    List<String> colorsList2 = new ArrayList<>(Arrays.asList("Orange", "White", "Yellow", "Cyan"));
    int[] numbersArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(2, 0, 11, 3, 5, 24, 3, 90, 99, 101, 44, 3, 8, -2, 77, 0, -25, 1, 2, 3, 86, 105));


    /////////////////////// Declaring, initializing and filing Array List /////////////////////

    {
        ArrayList<String> colorsList3 = new ArrayList<>();  // declaring and initializing empty array list
        colorsList3.add("Red");       // adding element to the end of the list
        colorsList3.add("Green");
        colorsList3.add("Blue");
        colorsList3.add(0,"Yellow"); // adding 1 new element to the specified position
        colorsList3.addAll(colorsList1);        // adding (copying) all elements from another collection to the end of the list
    }

    ArrayList<String> colorsList4 = new ArrayList<>(1000);  // array list with initial capacity allocated to it when created; default capacity os 10 elements

    List<String> colorsList5 = Arrays.asList("Violet", "Purple");  // fixed list (its size cannot be changed!) created by factory method;

    List<String> colorsList6 = new ArrayList<>(Arrays.asList("Violet", "Purple"));  // creating normal list (its size can be changed) by factory method

    List<String> colorsList7 = new ArrayList<>(colorsList1); // declaring array list and initializing it with elements from another collection

    List<Integer> numbersList3 = new ArrayList<>();  // in case primitives, argument may be only wrapped
    public void addNumbers() {
        numbersList3.add(1);
        numbersList3.add(2);
        numbersList3.add(10);
    }



    ///////////////// Conversions /////////////////////

    /// ints to list ///

    List<Integer> list1 = Stream.of(3, 1, 4, 5).sorted()
            .collect(Collectors.toList());

    /// String to list ///

    List<String> arr = Arrays.asList(str1.split(" "));

    // Array to list:
    List <Integer> strings = Arrays.stream(numbersArr)
            .boxed()
            .collect(Collectors.toList());

    /// Integer list to string list ///

    List<String> numbersStrings = numbersList1.stream()
            .map(Object::toString)
            .collect(Collectors.toList());

    /// String to ASCII number values list ///

    List<Integer> letters = str2.chars().boxed()
            .collect(Collectors.toList());

    /// String to Character list ///

    List<Character> ch = str2.chars()
            .mapToObj(e->(char)e)
            .collect(Collectors.toList());


    ////////////// Operations //////////////

    {
        numbersList2.stream()  // numbers1 - источник данных, к которому производится запрос
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

    /// Filtering ///

    List<String> list2 = Arrays.stream(str1.split(""))
            .filter(e -> e.equals("(") || e.equals(")"))
            .collect(Collectors.toList());

    /// Removing elements from Array List ///

    {
        colorsList1.remove("Blue");   // removing element from array list by element (only first element with such value)
        colorsList1.remove(1);   // removing element from array list at the specified position in index
        colorsList1.removeAll(colorsList2); // removing all elements previously added (copied) from another collection, it shall be indicated in parentheses
        numbersList1.removeIf(n -> (n < 8));   // removing elements on condition
        colorsList1.clear();            //  removing all elements from array list
    }

    /// Changing elements in Array List ///

    {
        colorsList1.set(0, "Colorless");  // replace element at the specified position in index
    }

    /// Reversing Array List ///

    {
        Collections.reverse(colorsList1);  // elements may be reversed using invocation of reverse() by Collections class; java.util.Collections must be imported
    }

    /// Size and search ///

    {
        colorsList1.size();  // size() returns the number of elements in this list
        colorsList1.get(0);  // get() returns the element at the specified position in this list.
        colorsList1.contains("Green");  // Returns true if this list contains the specified element.
    }





}
