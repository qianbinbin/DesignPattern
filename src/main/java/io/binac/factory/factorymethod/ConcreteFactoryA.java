package io.binac.factory.factorymethod;

import io.binac.factory.ConcreteProductA;
import io.binac.factory.IFactory;
import io.binac.factory.IProduct;

public class ConcreteFactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
