package io.binac.designpattern.strategy;

public class Context {
    private Strategy mStrategy;

    public Context(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void execute() {
        mStrategy.execute();
    }
}
