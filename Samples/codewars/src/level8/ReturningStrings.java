package level8;
// https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java

public class ReturningStrings {

    //Variant 1 (format)
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    //Variant 2 (Concatenation)
    public static String greet2(String name2) {
        return ("Hello, " + name2 + " how are you doing today?");

    }

    public static void main(String[] args) {
        System.out.println(greet("Hieronymus"));       //Variant 1 test
        System.out.println(greet2("Hippopotamus"));   //Variant 2 test
    }

}
