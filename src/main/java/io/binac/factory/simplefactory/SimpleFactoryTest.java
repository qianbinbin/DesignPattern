package io.binac.factory.simplefactory;

import io.binac.factory.IProduct;
import io.binac.factory.simplefactory.SimpleFactory.ProductType;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ProductType type = ProductType.TYPE_A;
        IProduct product = SimpleFactory.createProduct(type);
        product.use();
    }
}
