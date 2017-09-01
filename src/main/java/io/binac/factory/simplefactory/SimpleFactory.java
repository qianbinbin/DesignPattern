package io.binac.factory.simplefactory;

import io.binac.factory.ConcreteProductA;
import io.binac.factory.ConcreteProductB;
import io.binac.factory.IProduct;

public class SimpleFactory {

    public static IProduct createProduct(ProductType type) throws IllegalArgumentException {
        switch (type) {
            case TYPE_A:
                return new ConcreteProductA();
            case TYPE_B:
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("undefined product type");
        }
    }

    enum ProductType {
        TYPE_A,
        TYPE_B
    }
}
