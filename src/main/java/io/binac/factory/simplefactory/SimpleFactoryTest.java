package io.binac.factory.simplefactory;

import io.binac.factory.IProduct;
import io.binac.factory.simplefactory.ConcreteSimpleFactory.ProductType;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        IProduct product = ConcreteSimpleFactory.createProduct(ProductType.TYPE_A);
        product.use();
    }
}
