package io.binac.designpattern.command;

import org.junit.jupiter.api.Test;

class CommandTest {
    @Test
    void test() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.call(command);
    }
}