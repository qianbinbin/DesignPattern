package io.binac.designpattern.strategy;

import org.junit.jupiter.api.Test;

class StrategyTest {
    @Test
    void test() {
        Context context = new Context(new ConcreteStrategyA());
        context.execute();
        context.setStrategy(new ConcreteStrategyB());
        context.execute();
        context.setStrategy(() -> System.out.println("executing lambda expression"));
        context.execute();
    }
}