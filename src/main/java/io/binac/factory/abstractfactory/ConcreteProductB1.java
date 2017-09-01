package io.binac.factory.abstractfactory;

public class ConcreteProductB1 implements IProductB {
    @Override
    public void use() {
        System.out.println("using an instance of " + this.getClass());
    }
}
