package io.binac.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryB();
        IProduct product = factory.createProduct();
        product.use();
    }
}
