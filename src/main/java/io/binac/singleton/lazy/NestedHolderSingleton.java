package io.binac.singleton.lazy;

public class NestedHolderSingleton {
    private static class StaticSingletonHolder {
        private static final NestedHolderSingleton sInstance = new NestedHolderSingleton();
    }

    private NestedHolderSingleton() {
    }

    public static NestedHolderSingleton getInstance() {
        return StaticSingletonHolder.sInstance;
    }
}
