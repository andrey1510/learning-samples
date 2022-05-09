
//https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/java

public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }

    public static void main(String[] args) {
        System.out.println(howOld("8 is my age"));
    }

}
