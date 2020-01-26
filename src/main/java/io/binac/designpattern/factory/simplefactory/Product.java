package io.binac.designpattern.factory.simplefactory;

public interface Product {
    default void use() {
        System.out.println("using " + this);
    }
}
