package io.binac.factory.factorymethod;

import io.binac.factory.ConcreteProductB;
import io.binac.factory.IFactory;
import io.binac.factory.IProduct;

public class ConcreteFactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
