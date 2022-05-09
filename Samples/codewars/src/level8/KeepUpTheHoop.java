package level8;

//https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145/train/java

public class KeepUpTheHoop {
    public static String hoopCount(int n){
        return (n < 10) ? "Keep at it until you get it" : "Great, now move on to tricks";
    }

    public static void main(String[] args) {
        System.out.println(hoopCount(8));
        System.out.println(hoopCount(11));
    }

}
