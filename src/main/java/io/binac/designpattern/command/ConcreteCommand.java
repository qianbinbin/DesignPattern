package io.binac.designpattern.command;

public class ConcreteCommand implements Command {
    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
