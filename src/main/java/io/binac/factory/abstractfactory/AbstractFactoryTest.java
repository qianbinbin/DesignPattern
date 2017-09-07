package io.binac.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        IProductA productA = factory1.createProductA();
        IProductB productB = factory1.createProductB();
        productA.use();
        productB.use();
    }
}
