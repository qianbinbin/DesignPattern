package io.binac.designpattern.factory.abstractfactory;

public interface ProductA {
    default void use() {
        System.out.println("using " + this);
    }
}
