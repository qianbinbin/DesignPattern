package io.binac.factory.abstractfactory;

public class ConcreteProductA2 implements IProductA {
    @Override
    public void use() {
        System.out.println("using an instance of " + this.getClass());
    }
}
