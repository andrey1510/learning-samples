package FactorySimple;

public class TestClass {
    public static void main(String[] args) {
        FactoryClass factory = new FactoryClass();
        ClientClass request = new ClientClass(factory);

        request.orderProduct("Product A");
        request.orderProduct("Product B");

    }
}
