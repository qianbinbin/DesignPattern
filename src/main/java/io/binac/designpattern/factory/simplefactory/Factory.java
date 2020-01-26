package io.binac.designpattern.factory.simplefactory;

public class Factory {
    public static Product createProduct(ProductType type) throws IllegalArgumentException {
        switch (type) {
            case TYPE_A:
                return new ConcreteProductA();
            case TYPE_B:
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("undefined product type");
        }
    }

    public enum ProductType {
        TYPE_A,
        TYPE_B
    }
}
