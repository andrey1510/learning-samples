import java.util.*;

public class Raw1 {

    List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(numbersList1, numbersList2));
    List<String> colorsList = new ArrayList<> (Arrays.asList("Orange", "Blue", "Green", "Yellow", "Red", "Black"));
    List<Character> lettersList = new ArrayList<> (Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));

    Map<String, String> colorsMap = Map.of("G","Green", "Y", "Yellow","R", "Red","O", "Orange");

    Map<Integer, String> months = new HashMap<>();
    {
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
    }

    String phrase1 = "The quick brown fox jumps over the lazy dog";
    String phrase2 = "These days a chicken leg is a rare dish.";
    String phrase3 = "The source of the huge river is the clear spring.";
    String phrase4 = "The birch canoe slid on the smooth planks.";

    String[] colorsArray = new String[] {"Orange", "Blue", "Green", "Yellow", "Red", "Black"};
    int[] numbersArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    enum Color {
        WHITE, RED, GREEN, YELLOW, BLACK, ORANGE, VIOLET
    }
    enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT
    }

}
