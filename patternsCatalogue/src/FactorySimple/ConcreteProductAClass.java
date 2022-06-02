package FactorySimple;
                                                                     // Concrete product class,
public class ConcreteProductAClass extends AbstractProductClass {    // it shall extend abstract product class (or implement abstract product interface)
                                                                       // No class should derive from a concrete class.
                                                                       // No method should override an implemented method of abstract product class
                        // constructor to implement fields from abstract product class
    public ConcreteProductAClass() {
        name = "Product A";
        details = "Details set 1";
    }

}
