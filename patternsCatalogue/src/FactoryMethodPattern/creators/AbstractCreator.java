package FactoryMethodPattern.creators;

import FactoryMethodPattern.products.ProductInterface;

// Creator объявляет фабричный метод, который должен возвращать новые объекты продуктов.
// Зачастую фабричный метод объявляют абстрактным, чтобы заставить все подклассы реализовать его по-своему.

public abstract class AbstractCreator {

    public void launchProductCreation() {

        ProductInterface product = createProduct();
        product.workOnProduct();
    }

    public abstract ProductInterface createProduct();       // Фабричный метод

}
