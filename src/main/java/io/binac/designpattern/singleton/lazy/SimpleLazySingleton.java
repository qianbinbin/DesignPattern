package io.binac.designpattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleLazySingleton {
    private static SimpleLazySingleton sInstance;

    private static AtomicInteger sNumberOfCreation = new AtomicInteger(0);

    private SimpleLazySingleton() {
        sNumberOfCreation.incrementAndGet();
    }

    public static SimpleLazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new SimpleLazySingleton();
        }
        return sInstance;
    }

    public static int getNumberOfCreation() {
        return sNumberOfCreation.get();
    }
}
