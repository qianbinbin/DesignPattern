package io.binac.designpattern.factory.factorymethod;

public interface Product {
    default void use() {
        System.out.println("using " + this);
    }
}
