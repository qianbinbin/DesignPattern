package io.binac.designpattern.bridge;

public abstract class Abstraction {
    private Implementor mImplementor;

    public Abstraction(Implementor implementor) {
        mImplementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        mImplementor = implementor;
    }

    public void operation() {
        mImplementor.operationImp();
    }
}
