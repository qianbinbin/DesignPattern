package io.binac.designpattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton sInstance;

    private static AtomicInteger sNumberOfCreation = new AtomicInteger(0);

    private DoubleCheckedLockingSingleton() {
        sNumberOfCreation.incrementAndGet();
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return sInstance;
    }

    public static int getNumberOfCreation() {
        return sNumberOfCreation.get();
    }
}
