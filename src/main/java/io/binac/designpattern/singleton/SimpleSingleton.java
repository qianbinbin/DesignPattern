package io.binac.designpattern.singleton;

public class SimpleSingleton {
    private static final SimpleSingleton sInstance = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return sInstance;
    }
}
