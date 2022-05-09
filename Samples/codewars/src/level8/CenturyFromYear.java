package level8;

//https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java

public class CenturyFromYear {

    public static int century(int number) {
        return (number-1)/100+1;
    }

    public static void main(String[] args) {
        System.out.println(century(40000));
        System.out.println(century(1899));
        System.out.println(century(1900));
        System.out.println(century(1901));
        System.out.println(century(101));
        System.out.println(century(44));
        System.out.println(century(1));

    }

}