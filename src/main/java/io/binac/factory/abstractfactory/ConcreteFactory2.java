package io.binac.factory.abstractfactory;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public IProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB2();
    }
}
