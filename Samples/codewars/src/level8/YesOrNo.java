package level8;

public class YesOrNo {

    //Variant 1 (if-else)
    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        }
        else return "No";
    }

    //Variant 2 (ternary)
    public static String boolToWord2(boolean b2) {
        return b2 ? "Yes" : "No";
    }


    public static void main(String[] args) {
        System.out.println(boolToWord(true));     // Variant 1 test
        System.out.println(boolToWord(false));    // Variant 1 test
        System.out.println(boolToWord2(true));     // Variant 2 test
        System.out.println(boolToWord2(false));    // Variant 2 test
    }

}
