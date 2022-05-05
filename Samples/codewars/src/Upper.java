// https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/java

import java.lang.*;
import java.util.Locale;

class Upper {

    public static String MakeUpperCase(String str) {        // Variant 1 (toUpperCase)
       return str.toUpperCase(Locale.ENGLISH);
    }

    public static String MakeUpperCaseAlt(String str2) {      // Variant 2 (format)
        return String.format("%S", str2);
    }

    public static void main(String[] args) {
        System.out.println(MakeUpperCase("Test1"));         // Variant 1 test (toUpperCase)
        System.out.println(MakeUpperCaseAlt("Test2"));   // Variant 2 test (format)
    }
}


