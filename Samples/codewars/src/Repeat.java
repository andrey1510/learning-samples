//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

class Repeat {

    // Variant 1 (loop)
    public static String repeatStr(final int repeat, final String string) {
       String stringRepeat = "";
       for (int i=0; i<repeat; i++) {
           stringRepeat += string;  // stringRepeat = stringRepeat + string;
        }
       return stringRepeat;
    }

    // Variant 2 (repeat)
    public static String repeatStr2(final int repeat2, final String string2) {
        return string2.repeat(repeat2);
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(6,"Time1"));            // Variant 1 test
        System.out.println(repeatStr2(6,"Time2"));          // Variant 2  test
    }
}
