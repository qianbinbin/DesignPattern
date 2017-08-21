package io.binac.singleton.lazy;

public class SimpleLazySingleton {
    private static SimpleLazySingleton sInstance;

    private SimpleLazySingleton() {
    }

    public static SimpleLazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new SimpleLazySingleton();
        }
        return sInstance;
    }
}
