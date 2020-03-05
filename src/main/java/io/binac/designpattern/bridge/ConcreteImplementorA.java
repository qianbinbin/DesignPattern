package io.binac.designpattern.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImp() {
        new Throwable().printStackTrace();
    }
}
