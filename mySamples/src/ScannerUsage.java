
import java.util.Scanner;           // import of Scanner class
//ToDo add methods
public class ScannerUsage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide input.");  // just information message, not mandatory

        int i = scanner.nextInt();     // method to convert input into int
                      // nextLong(); nextByte(); nextShort(); nextDouble(); nextBoolean(); also exist
        //ToDo String s1 = scanner.nextLine(); // method to convert input into String
        String s2 = scanner.next(); // method to convert input into String

        // Results:
        System.out.println("The following int was entered: " + i);
        System.out.println("The following string was entered: " + s2);


        scanner.close();   // закрыть сканер
    }

}
