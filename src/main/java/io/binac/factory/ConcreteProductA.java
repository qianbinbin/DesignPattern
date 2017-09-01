package io.binac.factory;

public class ConcreteProductA implements IProduct {
    @Override
    public void use() {
        System.out.println("using an instance of " + this.getClass());
    }
}
