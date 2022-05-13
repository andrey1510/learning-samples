package level8;

//https://www.codewars.com/kata/5583090cbe83f4fd8c000051/java

import java.util.Arrays;

public class ReversedArray {
    public static int[] digitize(long n) {
        String nString = String.valueOf(n);
        int [] arr = new int[nString.length()];
        for (int i = 0; i < nString.length(); i++) {
            arr[i] = nString.charAt(nString.length()-1-i) - '0';
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(85361)));
    }

}
//        for (int i = 0; i < nString.length(); i++) {
//        arr[i] = nString.charAt(i);
//        }