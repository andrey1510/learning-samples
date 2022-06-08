abstract public class AbstractClass {

// Abstract class shall be declared with 'abstract' keyword and may have abstract and non-abstract methods. It is not mandatory to have any of them.
// Abstract class cannot be instantiated

    //////////////////////// ABSTRACT CLASS CONTENT //////////////////////////////

    abstract void doSomething(); // Abstract methods cannot have a body as it does not have implementation

    void calculate(){  // Non-abstract method shall have body.
        System.out.println("Sample of Non-abstract method");
    };

    static void print1() {    // Abstract class may have static method
        System.out.println("Sample of static method in abstract class.");
    };

    final void print2() {    // Abstract class may have final method
        System.out.println("Sample of static method in abstract class.");
    };

    public AbstractClass() {    // // Abstract class may have constructor
    }

    public static void main(String[] args) {        //ToDo
        AbstractClass r = new AbstractClass() {
            @Override
            void doSomething() {
                System.out.println("test?");
            }

        };
        r.doSomething();
    }


}

//////////////////////// EXTENDING ABSTRACT CLASS //////////////////////////////

class SubclassOfAbstractClass extends AbstractClass {  // Subclass of abstract class

    @Override
    void doSomething() {       // If abstract class has abstract method, subclass must either be abstract too or implement the method.
        System.out.println("Sample of implementation of abstract method of abstract class by subclass.");
    }

    public static void main(String[] args) {
        SubclassOfAbstractClass t = new SubclassOfAbstractClass();
        t.doSomething(); // invoking overriden abstract method
        t.print2();    // invoking non-abstract final method of abstract superclass
        t.calculate(); // invoking non-abstract method of abstract superclass

        AbstractClass.print1();   // invoking non-abstract static method of abstract superclass
    }

}

