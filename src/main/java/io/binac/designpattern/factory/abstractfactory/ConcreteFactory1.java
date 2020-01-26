package io.binac.designpattern.factory.abstractfactory;

public class ConcreteFactory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
