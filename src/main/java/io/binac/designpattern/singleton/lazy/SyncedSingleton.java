package io.binac.designpattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncedSingleton {
    private static SyncedSingleton sInstance;

    private static AtomicInteger sNumberOfCreation = new AtomicInteger(0);

    private SyncedSingleton() {
        sNumberOfCreation.incrementAndGet();
    }

    public static synchronized SyncedSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new SyncedSingleton();
        }
        return sInstance;
    }

    public static int getNumberOfCreation() {
        return sNumberOfCreation.get();
    }
}
