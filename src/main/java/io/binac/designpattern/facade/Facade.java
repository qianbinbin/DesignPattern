package io.binac.designpattern.facade;

public class Facade {
    private SystemA mSystemA = new SystemA();
    private SystemB mSystemB = new SystemB();
    private SystemC mSystemC = new SystemC();

    public void operation() {
        mSystemA.operationA();
        mSystemB.operationB();
        mSystemC.operationC();
    }
}
