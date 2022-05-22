import java.util.Scanner;

public class Exceptions {
    void someMethod() {

        try {                               // Try block, it shall cover code with potential exception
            int i1 = 2/0;                           // Code with potential exception
        } catch (ArithmeticException e) {   // Catch block. There may several catch blocks for 1 try block, or no catch blocks.
                                            // Only exceptions belonging to the class in parentheses of catch block will be caught!
            System.out.println(e);                  // Message on exception
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {  // Catch block multiple Java exceptions
            System.out.println(e);
        } catch (Exception e) {          // Catch block with general exception class
            System.out.println(e);
        } finally {                      // Finally block, not mandatory; there may be 1 finally block for 1 try block, or no finally blocks.
            System.out.println("Very important data");  // will be printed even in case some exception in try block (only there) will not be caught.
        }

    }
}



// Exception Propagation sample

class ExceptionPropagation {
    Scanner scanner = new Scanner(System.in);
    int x;
    int i;
    void divide() {
        System.out.println("Dividing 10/x. Please enter x value.");   // enter 0 to get an exception!
        x = scanner.nextInt();

        try {                           // Creating try block as an exception may be caused if 0 will be inputted
            // String s=null;
            // System.out.println(s.length());  // Uncomment code to illustrate usage of finally
            i = 10/x;                   //                  /0 is illegal
            System.out.println("10/" + x + " = " + i);
        } catch (ArithmeticException e1) {                  // Creating catch block;
            System.out.println("Wrong value entered. Exception handled: " + e1);
        }  finally {                                        // Creating finally block
            System.out.println("Proceed next.");
        }

    }
    public static void main(String[] args) {
        ExceptionPropagation t1 = new ExceptionPropagation();
            t1.divide();
    }
}













// ToDo Custom exception sample
