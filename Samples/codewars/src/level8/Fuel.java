
//https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java

public class Fuel {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }

    public static void main(String[] args) {                // tests
        System.out.println(zeroFuel(25, 15, 2));
        System.out.println(zeroFuel(50, 15, 3));
    }

}
