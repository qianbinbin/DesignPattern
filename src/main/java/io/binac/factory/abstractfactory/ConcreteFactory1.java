package io.binac.factory.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public IProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB1();
    }
}
