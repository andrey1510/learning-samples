package level8;

public class BooleanToString {
//    https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

    public static String convert(boolean b){                    // Variant 1 (if-else)

        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String convert2(boolean c){
        return Boolean.toString(c);
    }    // Variant 2 (toString)

    public static void main(String[] args) {
        System.out.println(convert(true));      // Variant 1 test
        System.out.println(convert(false));     // Variant 1 test
        System.out.println(convert2(true));     // Variant 2 test
        System.out.println(convert2(false));    // Variant 2 test

    }
}

