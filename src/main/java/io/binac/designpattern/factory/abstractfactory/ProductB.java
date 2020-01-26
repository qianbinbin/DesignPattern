package io.binac.designpattern.factory.abstractfactory;

public interface ProductB {
    default void use() {
        System.out.println("using " + this);
    }
}
