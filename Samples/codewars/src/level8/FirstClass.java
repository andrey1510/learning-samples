package level8;

//https://www.codewars.com/kata/5512a0b0509063e57d0003f5/train/java

public class FirstClass {
  public static byte sum (byte a, byte b) {
    return (byte) (a + b);
  }

  public static void main(String[] args) {      //test
    System.out.println(sum((byte) 2, (byte) 3));
  }

}
