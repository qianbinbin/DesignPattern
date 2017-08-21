package io.binac.singleton;

import io.binac.singleton.lazy.Singleton;
import io.binac.singleton.lazy.SyncedSingleton;

public class SingletonTest {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            SyncedSingleton.getInstance();
        }
        System.out.println("Synchronized lazy singleton costs "
                + (System.currentTimeMillis() - beginTime) + " milliseconds");

        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Singleton.getInstance();
        }
        System.out.println("Double locking singleton costs "
                + (System.currentTimeMillis() - beginTime) + " milliseconds");
    }
}
