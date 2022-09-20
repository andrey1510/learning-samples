public interface Interface {  // Interface is abstract by definition, so it cannot be instantiated.

    //////////////////////////// INTERFACE CONTENT //////////////////////////

    // Interface body can contain member declarations that include any of the following:

    // Abstract methods declarations:
    public abstract void calculate();  // methods in interface body are Abstract and Public by default; abstract methods shall not have a body.

    // Static methods declarations:
    static void multiply(){  // static methods in interface body must have a body; появилось в Java8 для использования лямбд (обратной совместимости)
        System.out.println("Sample of static method of interface implementation");
    }

    // Private methods declarations:
    private String read() { // private methods in interface body must have a body
        return null;
    }

    // Default methods declarations:
    default void write() { // default methods in interface body must have a body
    }

    //Constant declarations:
    public static final int UNIT_NUMBER = 1; // Constants are defined by field declarations and are public, static, and final by default.
                         // Constant must be initialized.
}

//////////////////////////// FUNCTIONAL INTERFACE //////////////////////////

@FunctionalInterface            // annotation may be used to indicate that interface type is intended to be functional interface
interface AnotherInterface {    // functional interface has only one method which shall be abstract
    boolean choose(boolean b);
}

//////////////////////////// Subinterfaces //////////////////////////

interface SubInterface extends Interface, AnotherInterface {     // multiple inheritance is possible
}

//////////////////////////// Interface realization //////////////////////////

class Test1 implements Interface, AnotherInterface {       // realization of interface; implementing multiple interfaces is possible

    @Override
    public void calculate() {   // if class implements interface with abstract method, it must be implemented in such class
        System.out.println("Sample of abstract method of interface implementation");
    }

    @Override
    public boolean choose(boolean b) {  // class may not narrower accessibility of interface method (e.g. private here may not be set)
        return false;
    }

    AnotherInterface object = new AnotherInterface() {      // Reference of an interface type can be declared
        @Override
        public boolean choose(boolean b) {
            return false;
        }
    };

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.calculate();  //  invocation of abstract method
        t.write();    //  invocation of default method

        Interface.multiply();   // Static method can be invoked only by using its qualified name (name of its interface with its simple name)
    }

}

//////////////////////////// Subinterfaces realization and inheritance //////////////////////////

class SubInterfaceTest implements SubInterface {

    @Override
    public void calculate() {
    }

    @Override
    public boolean choose(boolean b) {
        return false;
    }

    public static void main(String[] args) {

        SubInterfaceTest t = new SubInterfaceTest();
        t.calculate(); // subinterface inherits all members from its superinterfaces, except for any static methods or abstract or default methods that it overrides.
        t.write();  // subinterface inherits default methods from its superinterfaces
    }
}

