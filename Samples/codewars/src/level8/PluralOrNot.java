package level8;

//https://www.codewars.com/kata/52ceafd1f235ce81aa00073a/train/java

public class PluralOrNot {
    public static boolean isPlural(float f){
        return f != 1;
    }

    public static void main(String[] args) {
        System.out.println(isPlural(0.1f));
        System.out.println(isPlural(1f));
    }

}
