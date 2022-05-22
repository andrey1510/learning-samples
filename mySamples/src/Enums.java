public class Enums {

    // An enum type is a special data type that enables for a variable to be a set of predefined constants.

    // Sample of enum defined inside class
    public enum Color {
        WHITE, RED, GREEN, YELLOW       // enum type's fields shall always be in uppercase letters (as they are constants)
    }
}

// Sample of enum defined outside class
enum Numbers {
    ONE, TWO, THREE, FOUR, FIVE
}

// Sample of enum with specified initial values, methods and constructors
class Geography {
    enum Mountain {
        SMALL(2000), MEDIUM(3000), BIG(5000) ;   //  specifying initial values
                                                                    // semicolon must be added if there are other data inside enum
        private int height;             // declaring field with value
        Mountain(int height) {          // adding constructor
            this.height = height;
        }
        public void setHeight(int height) {     // adding method inside enum body
            this.height = height;
        }
    }
    public static void main(String[] args) {
        Mountain m1 = Mountain.MEDIUM;          //ToDo instance of enum may not be created
        System.out.println(m1 + " " + Mountain.MEDIUM.height);
        m1.setHeight(10000);
        System.out.println(m1 + " " + Mountain.MEDIUM.height);
    }
}


// Sample of implementing interface to enum
interface MyInterface {}
enum Day implements MyInterface {    // enum may implement interface but may not extend class
    MONDAY, TUESDAY, WEDNESDAY;

    //with main()  inside the enum outside class, it may be run directly.
    public static void main(String[] args) {
        Day d1 = Day.MONDAY;   // enum type (Day) is required to access constant (MONDAY)
        System.out.println(Day.MONDAY);

        // Sample of using switch with enum:
        switch (d1) {                           //ToDo
            case MONDAY: {
                System.out.println(MONDAY);
                break;
            }
            case TUESDAY: {
                System.out.println(TUESDAY);
                break;
            }
            case WEDNESDAY: {
                System.out.println(WEDNESDAY);
                break;
            }
        }
    }
}


