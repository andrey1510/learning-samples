package level8;

//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {6, 4, 22, 15}));
    }
}
