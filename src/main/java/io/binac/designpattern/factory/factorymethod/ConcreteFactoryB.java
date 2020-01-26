package io.binac.designpattern.factory.factorymethod;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
