package FactoryMethodPattern.products;

// Конкретные продукты содержат код различных продуктов.

public class ConcreteProductA implements ProductInterface {

    @Override
    public void workOnProduct() {
        System.out.println("--> ConcreteProductA method is working on Product A");
        System.out.println("Product A ready");
    }

}
