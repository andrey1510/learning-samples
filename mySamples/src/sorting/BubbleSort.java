package sorting;

// from https://github.com/Arhiser/java_tutorials/blob/master/src/ru/arhiser/sort/BubbleSort.java

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {   // проверка если правый элемент меньше левого
                    int tmp = array[i];         // замена элемента через временную переменную
                    array[i] = array[i - 1];    // замена элемента через временную переменную
                    array[i - 1] = tmp;         // замена элемента через временную переменную
                    isSorted = false;
                }
                System.out.println("  for cycle: " + Arrays.toString(array));
            }
            System.out.println("while cycle: " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubbleSort(array);
    }


}
