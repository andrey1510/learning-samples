package level8;// https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java

public class Paper {

    //Variant 1 (ternary)
    public static int paperWork(int n, int m) {
        return (n < 0 || m < 0) ? 0 : n*m;
    }

    //Variant 2 (if-else)
    public static int paperWork1(int n1, int m1) {
        if (n1 < 0 || m1 < 0) {
            return 0;
        }
        else {
            return n1*m1;
        }

    }

    public static void main(String[] args) {
        System.out.println(paperWork(3, 3));            // Variant 1 test
        System.out.println(paperWork(-1, 2));           // Variant 1 test
        System.out.println(paperWork1(3, 3));           // Variant 2 test
        System.out.println(paperWork1(-1, 2));        // Variant 2 test
    }

}
