package io.binac.designpattern.bridge;

import org.junit.jupiter.api.Test;

class BridgeTest {
    @Test
    void test() {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(() -> System.out.println("Lambda implementor"));
        abstraction.operation();
    }
}