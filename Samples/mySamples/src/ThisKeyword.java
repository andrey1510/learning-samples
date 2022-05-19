public class ThisKeyword {

    //Within instance method or constructor, "this" is a reference to the current object (i.e. object whose method or constructor is being called).
    // You can refer to any member of the current object from within an instance method or a constructor by using "this".
    // "this" reference cannot be used in a static context
    int i;
    public ThisKeyword(int i) {
        this.i = i;
    }
}

class Car {

    // Using "this" to refer current class instance variable in order to prevent shadowing
    int age = 5;
    public Car(int age) {           // parametrized constructor
        this.age = age;             // "this" keyword is used because "age" field is shadowed by constructor parameter "age".
    }
    public Car() {                  // no-argument constructor
    }

    // Using "this" to invoke constructor within current class
    String color = "Red";
    public Car(int age, String color) {
        this(age);          // constructor invoking
        this.color = color;
    }

    // Using "this" to invoke current class method
    void travel1() {
        System.out.println("Car is moving");
    }
    void travel2() {
        this.travel1();
        System.out.println("Car is turning");
    }

    // Using "this" to pass as an argument in the method
    void drive1(Car c) {
        System.out.println("Car is " + c);
    }
    void drive2() {
        drive1(this);
    }


    public static void main(String[] args) {

        Car car1 = new Car(3);                  // instance with parametrized constructor
        System.out.printf("Age using 'this' in parametrized constructor: %s%n", car1.age);
        Car car2 = new Car();                       // instance with no-argument constructor
        System.out.printf("Age using no-argument constructor: %s%n", car2.age);

        Car car3 = new Car(4, "Green");
        System.out.printf("Age and color using 'this' in constructor chaining: %s, %s%n", car3.age, car3.color);

        car1.travel1();
        car1.travel2();

        Car car4 = new Car();
        car4.drive2();
    }
}
