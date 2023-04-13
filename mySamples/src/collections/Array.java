package collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Array {

    ////////////////// One-dimensional array ///////////////

    int[] i = new int[2];       // array with 10 elements, default element value: 0
    char[] c = new char[0];     // zero-length arrays can be constructed

    ////////////////////// Declaration, instantiation and initialization ////////////////////////////

    {
        int[] arr2 = new int[3];          // declaration and instantiation
        arr2[0] = 11;                     // initialization
        arr2[1] = 22;
        arr2[2] = 33;

        int[] arr1;                       // array declaration
        arr1 = new int[] {8, 6, 2};       // anonymous array - declaration and instantiation

        String[] arr11 = new String[] {"abc", "dfe", "asd"};  // anonymous array - declaration, instantiation and initialization
        int[] arr3 = {3, 6, 22};          // this is illegal; instead, an anonymous array expression should be used
    }



}





