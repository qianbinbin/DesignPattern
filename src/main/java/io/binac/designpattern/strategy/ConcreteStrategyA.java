package io.binac.designpattern.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("executing " + this);
    }
}
