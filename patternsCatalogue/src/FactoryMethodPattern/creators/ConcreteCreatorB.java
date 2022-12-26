package FactoryMethodPattern.creators;

import FactoryMethodPattern.products.ConcreteProductB;
import FactoryMethodPattern.products.ProductInterface;

public class ConcreteCreatorB extends AbstractCreator {

    // Конкретные создатели по-своему реализуют фабричный метод, производя те или иные конкретные продукты.

    @Override
    public ProductInterface createProduct() {
        System.out.println("--> ConcreteCreatorB starts ProductB creation");
        return new ConcreteProductB();
    }
}
