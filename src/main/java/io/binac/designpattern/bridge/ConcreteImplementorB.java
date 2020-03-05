package io.binac.designpattern.bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImp() {
        new Throwable().printStackTrace();
    }
}
