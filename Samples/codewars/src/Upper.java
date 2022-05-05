// https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/java

import java.lang.*;
import java.util.Locale;

class Upper {

    public static String MakeUpperCase(String str) {        // Variant 1 (toUpperCase)
       return str.toUpperCase(Locale.ENGLISH);
    }

    public static String MakeUpperCaseAlt(String strAlt) {      // Variant 2 (format)
        return strAlt.format("%S", strAlt);
    }

    public static void main(String[] args) {
        Upper test = new Upper();
        System.out.println(test.MakeUpperCase("Test"));         // Variant 1 test (toUpperCase)
        System.out.println(test.MakeUpperCaseAlt("TestAlt"));   // Variant 2 test (format)
    }
}


