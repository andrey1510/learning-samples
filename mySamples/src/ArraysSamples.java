import java.util.Arrays;

public class ArraysSamples {

    ////////////////// One-dimensional array ///////////////

    int[] i = new int[2];       // array with 10 elements, default element value: 0
    char[] c = new char[0];     // zero-length arrays can be constructed

    ////////////////////// Declaration, instantiation and initialization ////////////////////////////

    public static void main(String[] args) {

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

class Array {
    int[] arr4;           // declaration
    public Array() {
        arr4 = new int[] {10,20,30,40,50,60,71,80,90,91};     // instantiation and initialization via constructor
    }
}

class Array3 {

    public static void main(String[] args) {
        int[] arr8 = new int[3];
        int n = 5;

        for(int i=0;i<arr8.length;i++) {
            arr8[i] = n;
            n = n*5;
        }

        System.out.println(Arrays.toString(arr8));
    }
}




//////////////////////////// Actions with array //////////////////////////////////

class Array2 {


    public static void main(String[] args) {
        int[] i5 = new int[] {3, 6, 22, 6};

        int q = i5.length;                      // quantity of elements
        System.out.println(q);

    }

}

class Array5 {

    public static void main(String[] args) {
        int[] i5 = new int[5];

        for(int i:i5) {
            System.out.println(i);
        }

    }
}