package io.binac.singleton.lazy;

public class SyncedSingleton {
    private static SyncedSingleton sInstance;

    private SyncedSingleton() {
    }

    public static synchronized SyncedSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new SyncedSingleton();
        }
        return sInstance;
    }
}
