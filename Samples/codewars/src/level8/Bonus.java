package level8;
//https://www.codewars.com/kata/56f6ad906b88de513f000d96/train/java

public class Bonus {

    // Variant 1 (ternary)
    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "\u00A3" + salary * 10 : "\u00A3" + salary;
    }

    // Variant 2 (if else)
    public static String bonusTime2(final int salary2, final boolean bonus2) {
        if (bonus2) {
            return "\u00A3" + salary2*10;
        } else {
            return "\u00A3" + salary2;
        }
    }

    public static void main(String[] args) {
        // Variant 1 tests
        System.out.println(bonusTime(10, true));
        System.out.println(bonusTime(10, false));
        // Variant 2 tests
        System.out.println(bonusTime2(10, true));
        System.out.println(bonusTime2(10, false));
    }

}
