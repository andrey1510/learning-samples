package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListsIterators {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};

        // Iterator sample (while):
        Iterator<Integer> itr1 = numbers.iterator();  // creating iterator; import of  java.util.Iterator is needed
        while (itr1.hasNext()) { // condition to end loop
            System.out.println(itr1.next()); // printing element and moving to next
        }

        // Iterator sample (enhanced for)):
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Iterator sample (for)):
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Iterator sample (forEach, lambda)):
        numbers.forEach(System.out::println);

        // Iterator sample (forEach, stream)):
        numbers.stream().forEach((n) -> System.out.println(n));


    }


}
