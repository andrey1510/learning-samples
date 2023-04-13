package collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maps {

    public static ArrayList<int[]> arrList1() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        return list;
    }

    public static void main(String[] args) {

    /////////////////// Map ///////////////

        Map<Integer, Integer> count = arrList1().stream()
                .collect(Collectors.toMap(e -> arrList1().indexOf(e), e -> (Integer)e[0]-e[1]));
        int sum = count.values().stream().reduce(0, Integer::sum);

        System.out.println("Map: \n");
        count.forEach((key, value) -> System.out.println("Key: " + key + "\t Value: " + value));

        ///////////////
        List<Integer> numbersList0 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Map<Integer, Integer> map2 = numbersList0.stream().collect(Collectors.toMap(numbersList0::indexOf, e -> e));


    /////////////////// Flat Map ///////////////////
    //

        List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(numbersList1, numbersList2));
        System.out.println("List of lists: " + listOfLists);

        List<Integer> flatMappedList = listOfLists.stream()
                .flatMap(Collection::stream)                 // similar to   e -> e.stream()
                .collect(Collectors.toList());
        System.out.println("listOfLists via flat map : " + flatMappedList);

    }
}
