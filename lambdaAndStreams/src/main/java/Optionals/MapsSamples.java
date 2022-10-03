package Optionals;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsSamples {

    public static void main(String[] args) {

        //////////// FlatMap vs Map ///////////

        List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(numbersList1, numbersList2));
        System.out.println("List of lists: " + listOfLists);

        List<Stream<Integer>> mappedList = listOfLists.stream()
                .map(Collection::stream)                 // similar to   e -> e.stream()
                .collect(Collectors.toList());
        System.out.println("listOfLists via map : " + mappedList);

        List<Integer> flatMappedList = listOfLists.stream()
                .flatMap(Collection::stream)                 // similar to   e -> e.stream()
                .collect(Collectors.toList());
        System.out.println("listOfLists via flat map : " + flatMappedList);
    }


//
//    List<List<Object>> list = ...
//    List<Object> flat =
//            list.stream()
//                    .flatMap(List::stream)
//                    .collect(Collectors.toList());

//
//    Data1 s = new Data1(1,null,1);
//
//    public int getIDOptional(Optional<Data1> s) {
//        return s.stream()
//                .flatMap(Data1::getTitle)
//                .map(Data1::getID)
//                .orElse("NullTitle");
//    }
//
//    List<String> colors1 = new ArrayList<>(Arrays.asList(null, "Blue", "Green", "Yellow"));
//    Optional<Object> optColors1 = colors1.ifPresent(x -> System.out.println("ok"));
//


}

