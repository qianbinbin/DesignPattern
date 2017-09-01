package io.binac.factory;

public class ConcreteFactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
