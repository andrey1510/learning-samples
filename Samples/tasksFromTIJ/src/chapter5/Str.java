package chapter5;

// TiJ Ch.2, Tasks 1,2

public class Str {
    static String s0;
    static String s1 = "S1";
    public Str(String s2) {
        System.out.println(s2);
    }

    public static void main(String[] args) {
        System.out.println(s0);
        System.out.println(s1);
        new Str("S2");
    }
}
