package chapter2;


public class Chapter2Misc {

    public static void main(String[] args) {

        String a1;
        a1 = "A1";
        String a2 = "A2";
        String a3 = new String ("A3");


// TiJ Ch.2, Task 9

        int i1 = 1;
        Integer i1Wrapped = new Integer(i1); // boxing
        char b1 = 'b';
        Character b2Wrapped = b1; // boxing
        char b2Unwrapped = b2Wrapped; // unboxing
        double d1 = 1.545;
        float f1 = 1.6577f;
        Double d1Wrapped = d1; // boxing
        Float f1Wrapped = f1; // boxing
        float f1Unwrapped = f1Wrapped; // unboxing

        System.out.println("i1Wrapped is" + i1Wrapped.getClass().getSimpleName());
        System.out.println("b2Wrapped is" + b2Wrapped.getClass().getSimpleName());

    }

}
