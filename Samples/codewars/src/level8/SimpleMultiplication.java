package level8;
//https://www.codewars.com/kata/583710ccaa6717322c000105/train/java

public class SimpleMultiplication {

    // Variant 1 (if - else)
    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return n*8;
        } else {
            return n*9;
        }
    }

    // Variant 2 (ternary)
    public static int simpleMultiplication2(int n2) {
        return (n2 % 2 == 0) ? n2*8 : n2*9;
    }

    public static void main(String[] args) {
        // Variant 1 tests
        System.out.println(simpleMultiplication(3));
        System.out.println(simpleMultiplication(4));
        // Variant 2 tests
        System.out.println(simpleMultiplication2(3));
        System.out.println(simpleMultiplication2(4));
    }

}
