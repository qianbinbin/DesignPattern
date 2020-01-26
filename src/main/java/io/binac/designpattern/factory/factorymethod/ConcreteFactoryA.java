package io.binac.designpattern.factory.factorymethod;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
