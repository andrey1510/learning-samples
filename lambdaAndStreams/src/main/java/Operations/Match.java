package Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Match {
    static List<Integer> numbers4 = new ArrayList<>(Arrays.asList(3, 0, 2, 105));

    public static void main(String[] args) {

        boolean containsZero = numbers4.stream()
                .anyMatch(n -> n == 0);     // удовлетворяет ли заданному предикату хотя бы один элемент из потока данных

        boolean allMoreThanZero = numbers4.stream()
                .allMatch(n -> n > 0);      // проверяет, удовлетворяют ли заданному предикату все элементы потока данных

        boolean noZero = numbers4.stream()
                .noneMatch(n -> n == 0);   // проверяет, точно ли ни один элемент списка не соответствует заданному предикату

        int smallestNonZero = numbers4.stream()
                .sorted()
                .filter(n -> n > 0)
                .findAny().orElse(0);     // возвращает первый элемент списка, целесообразно использовать с другими операциями
        // применяется Optional

        Optional<Integer> maxNumber4 = numbers4.stream().reduce(Integer::max);

        //Comparator<Integer> numbers4Comparator = Comparator.comparing(numbers4.get(1));

        //int minElement = numbers4.stream()
        //      .min().getAsInt();


        System.out.println("List contains zero: " + containsZero);
        System.out.println("All elements of the list is more than zero: " + allMoreThanZero);
        System.out.println("No element of the list is zero: " + noZero);
        System.out.println("Smallest non-zero number of the list is: " + smallestNonZero);
    }
}
