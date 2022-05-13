package level7;
//https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java

public class Maskify {
    public static String maskify(String str) {
        StringBuilder maskedStr = new StringBuilder(str);
        for (int i = 0; i<(str.length()-4); i++) {
            maskedStr.setCharAt(i,'#');
        }
        return String.valueOf(maskedStr);
    }

    public static void main(String[] args) {        // tests
        System.out.println(maskify("3ds4fcxdg4d3k i"));
        System.out.println(maskify("34dcx3ki"));
        System.out.println(maskify("d6xc16"));
        System.out.println(maskify("4d3"));
        System.out.println(maskify("43"));
        System.out.println(maskify("s"));
        System.out.println(maskify(""));

    }
}
