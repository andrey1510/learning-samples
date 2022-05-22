public class Conversions {
    public static void main(String[] args) {

        // Primitives conversions
        int i = 4;
        float f = i;        // widening conversion is done implicitly
        double d = (double)i;  // widening conversion may be done with a cast (cast down)

        float g = 12.76543f;
        byte b = (byte)g;   // narrowing conversion is explicit, must be done with a cast (cast up)

        System.out.println("Widening primitive conversion of integral type int to integral type double: " + i + " to " + d);
        System.out.println("Narrowing primitive conversion of integral type float to integral type byte: " + g + " to "+ b);

        // Boxing and unboxing (conversion of primitives to references)
        Integer integ1 = 12;   // autoboxing
        int pr1 = 6;
        Integer integ2 = pr1;   // autoboxing
        int pr2 = integ1;   // unboxing

        // String conversions
        String str = "text " + 1;  // String conversions allow conversion of any other type with concatenation operator +
        System.out.println(str);
    }

}

class Conversions2 {


    // Sample of Method invocation conversion
    long method1(long d) {    //ToDo
        return 1;
    }
    public static void main(String[] args) {
        Conversions2 test1 = new Conversions2();
        int i = (int) test1.method1((long) 1.453);
        test1.method1(1l); //implicit and explicit
// ToDo constructor

        // Sample of Assignment Conversion
        Character c = 33;       // (in this case implicit narrowing of int -> char -> Character with boxing)
        System.out.println(c);

        // Samples of Assignment Conversion in Arithmetic Expressions

        byte b1;
        byte b2 = 4;
        b1 = (byte) -b2; // cast required as -b2 was promoted to int and implicit narrowing conversion was not conducted

        short s1 = 4;
        short s2 = 1;
        s1 = (short) (s1 + s2); /* cast required as s1 and s2 were promoted int during operation
                    whole operation shall be cast, this    (short) s1 + s2     and this    (short)s1 + (short)s2   will not work
                    as the operation shall be in int */
        s1 += s2;  // equivalent to    s1 = (short) (s1 + s2)      in this case conversion is implicit

        double d1 = (double) (1 / 2 + 3 / 2 + 0.1);         // result is 1.1. as 1/2 and 3/2 will be promoted to int
        double d2 =  ((double)1 / (double)2 + (double)3 / (double)2 + 0.1);  // result is 2.1 as 1/2 and 3/2 were cast to double prior to operation
        System.out.println(d1);
        System.out.println(d2);
        int k = 1;
        long l = 2;
        float f1 = 0.5f;
        long i1 = k / l;
        float v = i1 + f1;  //ToDo sample with implicit conversion in operation
    }

}