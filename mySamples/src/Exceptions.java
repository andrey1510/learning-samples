
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


///////////////    THROWS, TRY-CATCH, PROPAGATION SAMPLES    ///////////////


public class Exceptions {                           // 'throws' keyword is used in methods and constructor headers with checked exception.
                                                    // 'throws' declares (propagates) exception but doesn't handle it. Exception must be handled elsewhere.
    void read() throws FileNotFoundException {      // Several exception classes may be indicating using ',' as a separator.
        File text1 = new File("C:\\Users\\WA\\Desktop\\MissingFile.txt");
        Scanner sc1 = new Scanner(text1);      // This is a checked exception which means that without 'throws', 'throw' or 'try-catch' code will not compile.
        while (sc1.hasNextLine())
            System.out.println(sc1.nextLine());
    }

    int i;
    int x;
    void divide() {
        System.out.println("Dividing 100/x. Please enter x value.");   // enter 0 to get unchecked exception
        Scanner sc2 = new Scanner(System.in);
        x = sc2.nextInt();
                                        // Try-catch can be used directly without propagation.
        try {                           // Try block, it shall cover code with exception
            i = 10 / x;                       // unchecked exception if x = 0
        } catch (ArithmeticException | NullPointerException e) {   // Catch block. There may several catch blocks for 1 try block, or no catch blocks.
                                                         // Multiple exceptions classes may be indicated in parentheses using '|'.
            System.out.println("TRY-CATCH SAMPLE. Wrong value entered. Exception handled: " + e);
        }

        System.out.println("100/" + x + " = " + i);
    }
}

class ExceptionsTest {                          // In this case exception was propagated by 'throws' to this class.
    public static void main(String[] args)  {
        Exceptions t1 = new Exceptions();

        try {                                   // 'try' block
            t1.read();                      // Checked exception was propagated here, so without 'try-catch' or further throwing code will not compile.
        } catch (FileNotFoundException e) {     // 'catch' block.
            System.out.println("THROWS SAMPLE. File not found. Exception handled: " + e);                  // Message on exception
        }
        t1.divide();
    }
}


///////////////////    FINALLY SAMPLE    ///////////////////


class FinallySample {
    void divide(int x) {
        try {                           // Creating 'try' block as an exception may be caused if dividing by 0 occur
            System.out.println("Dividing 100 math exercise.");
            String str=null;
            System.out.println(str.codePointAt(1));  // Try-catch won't help as other exception will occur first.
            int i = 100/x;                   //
            System.out.println("100/" + x + " = " + i);
        } catch (ArithmeticException e) {
            System.out.println("Wrong value entered. Exception handled: " + e);
        }  finally {        // 'finally' block will ensure that message in it will be printed despite the checked exception was not handled by try-catch.
            System.out.println("FINALLY SAMPLE, message will still work: Proceed to next exercise.");
        }
   }
    public static void main(String[] args) {
        FinallySample t1 = new FinallySample();
            t1.divide(0);
   }
}


//////////////////  Nested try block sample  //////////////////


class NestedTryBlock {
    void divide() {
        try {                                           // outer try block
            try {                                       // inner try block #1
                try {                                   // inner try block #2
                    int x = 1/0;            // trigger for ArithmeticException in inner try block #2
                } catch (ArithmeticException e) {       // catch block for outer try block
                    System.out.println("Inner try block #2. Exception handled: " + e);
                }
                String str=null;              // trigger for NullPointerException in inner try block #1
                System.out.println(str.codePointAt(1));
            } catch (NullPointerException e) {          // catch block for inner try block #2
                System.out.println("Inner try block #1. Exception handled: " + e);
            }
            String str="";
            short s = Short.parseShort(str);  // trigger for NumberFormatException in outer try block
        } catch (Exception e) {                         // catch block for outer try block
                                                        // (general class was used, NumberFormatException may be used instead)
            System.out.println("Outer try block. Exception handled: " + e);
        }
    }
    public static void main(String[] args) {
        NestedTryBlock t1 = new NestedTryBlock();
        t1.divide();
    }
}


////////////////  'trow' sample  ////////////////


class ThrowSample {         // 'trow' keyword is mostly used to create custom exceptions; it works with both checked and unchecked exceptions
    Scanner scanner = new Scanner(System.in);
    int y;
    void enterNumber() {
        System.out.println("Enter any number from 1 to 10.");
        y = scanner.nextInt();
        if (y > 0 && y > 10) {
            throw new ArithmeticException("Description");  // Description in parentheses is optional.
        } else {
            System.out.println("Your number x100 is: " + y * 100);
        }
    }
}
class ThrowSampleTest {
    public static void main(String[] args) {
        ThrowSample t1 = new ThrowSample();
        try {                       // 'try' block to handle thrown custom Arithmetic exception
            t1.enterNumber();
        } catch (ArithmeticException e) {
            System.out.println("Wrong number entered. Exception handled:  " + e);
        }
    }
}


//////////////////// Custom exception sample //////////////

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomExceptionThrow  {
    Scanner scanner = new Scanner(System.in);
    int y;
    void enterNumber() throws CustomException {
        System.out.println("Enter any number from 1 to 10.");
        y = scanner.nextInt();
        if (y > 0 && y > 10) {
            throw new CustomException("Description");
        } else {
            System.out.println("Your number x100 is: " + y * 100);
        }
    }
}
class CustomExceptionTest {
    public static void main(String[] args) {
        CustomExceptionThrow t1 = new CustomExceptionThrow();
        try {                       // 'try' block to handle thrown custom Arithmetic exception
            t1.enterNumber();
        } catch (CustomException e) {
            System.out.println("Wrong number entered. Exception handled:  " + e);
        }
    }
}

