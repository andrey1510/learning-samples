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

// Sample of invocation conversion in method
class Conversions2 {
     int method1(int i) {
        return i;
    }
    public static void main(String[] args) {
        Conversions2 test1 = new Conversions2();
        test1.method1((int)2.453);                //  explicit conversion from double to int as method has int parameter
        short s = 3;
        test1.method1(s);                        // implicit conversion from short to int
    }
}

// Sample of invocation conversion in constructor
class Conversions3 {
    public Conversions3(int i) {
    }
    public static void main(String[] args) {
        Conversions3 t1 = new Conversions3((int)4.5354f);    // explicit conversion
        Conversions3 t2 = new Conversions3('a');           // implicit conversion
    }
}


class Conversions4 {
    double method2 (double d) {
        return d;
    }
    public static void main(String[] args) {
        Conversions4 test1 = new Conversions4();

        // Samples of Assignment Conversion
        Character c = 33;       // (in this case implicit narrowing of int -> char -> Character with boxing)
        int i1 = (int) 1.32;     // explicit narrowing
        int i2 = (int) test1.method2(1.324);   // explicit narrowing

        // Samples of Conversions in operations

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

        int i = 2;
        float f = 0.5f;
        float v = i + f;  // implicit conversion in operation
        System.out.println(v);
    }

}