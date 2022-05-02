public class BooleanToString {
//    https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

    static boolean d = true;
    public static String convert(boolean b){

        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String convert2(boolean c){
        return Boolean.toString(c);
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
        System.out.println(convert2(true));
        System.out.println(convert2(false));

    }
}

