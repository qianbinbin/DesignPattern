package io.binac.designpattern.adapter;

public class Adaptee {
    public void specificRequest() {
        new Throwable().printStackTrace();
    }
}
