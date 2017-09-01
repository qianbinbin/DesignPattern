package io.binac.factory.abstractfactory;

public class ConcreteProductA1 implements IProductA {
    @Override
    public void use() {
        System.out.println("using an instance of " + this.getClass());
    }
}
