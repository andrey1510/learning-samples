package FactorySimple;

public class TestClass {
    public static void main(String[] args) {
        CreatorClass factory = new CreatorClass();
        ClientClass request = new ClientClass(factory);

        request.orderProduct("Product A");
        request.orderProduct("Product B");

    }
}
