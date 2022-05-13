package level8;
//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
public class YouNeedOnlyOne {

    public static boolean check(Object[] a, Object x) {
        boolean result = false;
        for (Object a1 : a) {
            if (a1 == x) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[]{33, 22, 444}, 22));
        System.out.println(check(new Object[]{33, 22, 112}, 11));
        System.out.println(check(new Object[]{'d', 'g', 'e'}, 'g'));
        System.out.println(check(new Object[]{'d', 'g', 'e'}, 'x'));
        System.out.println(check(new Object[]{"dg", "ggg", "erd"}, "ggg"));
        System.out.println(check(new Object[]{"d", "g", "exc"}, "ex"));
    }

}
