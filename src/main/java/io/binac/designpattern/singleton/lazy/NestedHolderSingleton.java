package io.binac.designpattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

public class NestedHolderSingleton {
    private static AtomicInteger sNumberOfCreation = new AtomicInteger(0);

    private NestedHolderSingleton() {
        sNumberOfCreation.incrementAndGet();
    }

    private static class StaticSingletonHolder {
        private static final NestedHolderSingleton sInstance = new NestedHolderSingleton();
    }


    public static NestedHolderSingleton getInstance() {
        return StaticSingletonHolder.sInstance;
    }

    public static int getNumberOfCreation() {
        return sNumberOfCreation.get();
    }
}
