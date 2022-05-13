package level8;

//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java


import java.util.Arrays;

public class Alphabet {

    // Variant 1
    public static String position(char alphabet) {
        char[] lettersList = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int result = 0;
        for (int i = 0; i < lettersList.length; i++) {
            if (lettersList[i] == alphabet) {
                result = i+1;
            }
        }
        return "Position of alphabet: " + String.valueOf(result+1);
    }

    // Variant 2
    public static String position2(char alphabet2) {
        char[] lettersList2 = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int result2 = Arrays.binarySearch(lettersList2, alphabet2);
        return "Position of alphabet: " + String.valueOf(result2+1);
    }


    public static void main(String[] args) {
        System.out.println(position('c'));      // Variant 1 test
        System.out.println(position2('c'));     // Variant 2 test
    }
}
