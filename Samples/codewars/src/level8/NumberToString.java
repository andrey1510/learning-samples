
//https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

public class NumberToString {

    // Variant 1
    public static String numberToString(int num) {
        return (String.valueOf(num));
    }

    // Variant 2
    public static String numberToString2(int num2) {
        return Integer.toString(num2);
    }

    public static void main(String[] args) {
        System.out.println(numberToString(444));             // Variant 1 Test
        System.out.println(numberToString2(555));      // Variant 2 Test
    }

}
