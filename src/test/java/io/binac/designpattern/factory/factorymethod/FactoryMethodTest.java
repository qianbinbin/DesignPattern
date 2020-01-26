package io.binac.designpattern.factory.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    @Test
    void test() {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        assertTrue(product instanceof ConcreteProductA);
        product.use();

        factory = new ConcreteFactoryB();
        product = factory.createProduct();
        assertTrue(product instanceof ConcreteProductB);
        product.use();
    }
}