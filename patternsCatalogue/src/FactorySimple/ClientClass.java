package FactorySimple;

public class ClientClass {          // Class ordering instances of products
                         // It orders the creation of product - passes the received type of product to Creator class and calls all required methods of product classes

    FactoryClass factory;                           // Creating object of creator (factory) class and constructor in order to get reference to such creator class
    public ClientClass(FactoryClass factory) {
        this.factory = factory;
    }

    public AbstractProductClass orderProduct (String type) {      // method to order product
        AbstractProductClass product;
        product = factory.createProduct(type);
        product.inform();
        product.assemble();
        product.deliver();
        return product; //ToDo
    }

    public static void main(String[] args) {
        FactoryClass factory = new FactoryClass();
        ClientClass request = new ClientClass(factory);

        request.orderProduct("Product A");
        request.orderProduct("Product B");

    }

}
