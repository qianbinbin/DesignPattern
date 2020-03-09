package io.binac.designpattern.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        new Throwable().printStackTrace();
    }
}
