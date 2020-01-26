package io.binac.designpattern.factory.abstractfactory;

public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
