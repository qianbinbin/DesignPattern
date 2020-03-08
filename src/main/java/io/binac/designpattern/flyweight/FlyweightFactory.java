package io.binac.designpattern.flyweight;

import java.util.WeakHashMap;

public class FlyweightFactory {
    private static final WeakHashMap<String, Flyweight> sCache = new WeakHashMap<>();

    public static Flyweight get(String key) {
        return sCache.computeIfAbsent(key, s -> new Flyweight());
    }

    public static int size() {
        return sCache.size();
    }
}
