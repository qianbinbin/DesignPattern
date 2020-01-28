package io.binac.designpattern.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("executing " + this);
    }
}
