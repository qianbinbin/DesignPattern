package io.binac.designpattern.adapter;

public class ObjectAdapter implements Target {
    private final Adaptee mAdaptee;

    public ObjectAdapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void request() {
        mAdaptee.specificRequest();
    }
}
