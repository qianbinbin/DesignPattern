package io.binac.factory;

public class ConcreteFactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
