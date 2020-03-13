package io.binac.designpattern.command;

public class Invoker {
    void call(Command command) {
        command.execute();
    }
}
