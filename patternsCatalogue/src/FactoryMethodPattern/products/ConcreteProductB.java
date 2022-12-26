package FactoryMethodPattern.products;

// Конкретные продукты содержат код различных продуктов.

public class ConcreteProductB implements ProductInterface {

    @Override
    public void workOnProduct() {
        System.out.println("--> ConcreteProductA method is working on Product A");
        System.out.println("Product B ready");
    }
}
