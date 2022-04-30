package chapter5;

public class Overload {

    static void methodOverload() {
        System.out.println("Default");
    }
    static void methodOverload(int i) {
        System.out.println("Overload " + i);
    }
    static void methodOverload(char c) {
        System.out.println("Overload " + c);
    }
    static void methodOverload(float f) {
        System.out.println("Overload " + f);
    }
    static void methodOverload2 (int j, String s) {
        System.out.println("Overload2 " + j + s);
    }
    static void methodOverload2 (String s, int j) {
        System.out.println("Overload2 " + s + j);
    }

    public static void main(String[] args) {

        new Overload();      // default constructor

        methodOverload();
        methodOverload(1);
        methodOverload('c');
        methodOverload(1.787f);

        methodOverload2(1, "second");
        methodOverload2("second", 1);
    }

}


