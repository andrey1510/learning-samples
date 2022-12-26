package FactoryMethodPattern.creators;

import FactoryMethodPattern.products.ConcreteProductA;
import FactoryMethodPattern.products.ProductInterface;

// Конкретные создатели по-своему реализуют фабричный метод, производя те или иные конкретные продукты.


public class ConcreteCreatorA extends AbstractCreator {

    @Override
    public ProductInterface createProduct() {
        System.out.println("--> ConcreteCreatorA starts ProductA creation");
        return new ConcreteProductA();
    }
}
