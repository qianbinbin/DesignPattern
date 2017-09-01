package io.binac.factory.factorymethod;

import io.binac.factory.IFactory;
import io.binac.factory.IProduct;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryB();
        IProduct product = factory.createProduct();
        product.use();
    }
}
