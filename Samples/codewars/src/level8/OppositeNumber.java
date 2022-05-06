package level8;

//https://www.codewars.com/kata/56dec885c54a926dcd001095/train/java

public class OppositeNumber {

    //Variant 1
    public static int opposite(int number) {
        return number -= (number*2);
    }

    //Variant 2
    public static int opposite2(int number2) {
        return -number2;
    }

    public static void main(String[] args) {
        System.out.println(opposite(8));    //Variant 1 test
        System.out.println(opposite(-8));   //Variant 1 test
        System.out.println(opposite2(4));    //Variant 2 test
        System.out.println(opposite2(-4));   //Variant 2 test
    }

}
