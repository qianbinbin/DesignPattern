package io.binac.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        IProductA productA = factory.createProductA();
        IProductB productB = factory.createProductB();
        productA.use();
        productB.use();
    }
}
