package io.binac.designpattern.factory.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {
    @Test
    void test() {
        Product product = Factory.createProduct(Factory.ProductType.TYPE_A);
        assertTrue(product instanceof ConcreteProductA);
        product.use();

        product = Factory.createProduct(Factory.ProductType.TYPE_B);
        assertTrue(product instanceof ConcreteProductB);
        product.use();
    }
}