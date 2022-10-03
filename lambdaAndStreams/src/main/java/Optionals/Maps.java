package Optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maps {

    public static void main(String[] args) {


    /////////////////// Flat Map ///////////////////
    //

    List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
    List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
    List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(numbersList1, numbersList2));
        System.out.println("List of lists: " + listOfLists);

    List<Stream<Integer>> mappedList = listOfLists.stream()
            .map(Collection::stream)
            .collect(Collectors.toList());
        System.out.println("listOfLists via map : " + mappedList);

    }
}
