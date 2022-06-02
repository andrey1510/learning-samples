package FactorySimple;

public class CreatorClass {     // creator class (factory) creates products by referring to product classes
                                // its function is to determine logic of concrete product choice and create the product instance

                            // the code below is moved to this separate class, so Client class will not need to be changed in case of products adding/removal

    public AbstractProductClass createProduct(String type) {    // ToDo
        AbstractProductClass product = null;            // declaring and instantiating product object, it is null in order to choose concrete product class (code below)
        if (type.equals("Product A")) {
            product = new ConcreteProductAClass();      // choice of the required concrete product class
        } else if (type.equals("Product B")) {
            product = new ConcreteProductBClass();
        }
        return product;                      // assigning new reference (with concrete product class) to the product object
    }


}
