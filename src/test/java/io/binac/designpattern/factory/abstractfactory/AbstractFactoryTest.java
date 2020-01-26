package io.binac.designpattern.factory.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    void test() {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        assertTrue(productA instanceof ConcreteProductA1);
        productA.use();
        ProductB productB = factory.createProductB();
        assertTrue(productB instanceof ConcreteProductB1);
        productB.use();

        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        assertTrue(productA instanceof ConcreteProductA2);
        productA.use();
        productB = factory.createProductB();
        assertTrue(productB instanceof ConcreteProductB2);
        productB.use();
    }
}