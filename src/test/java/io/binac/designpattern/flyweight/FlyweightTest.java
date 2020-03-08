package io.binac.designpattern.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.ref.WeakReference;
import java.time.Duration;

class FlyweightTest {
    @Test
    void test() {
        // create a String object to avoid String pool
        String key = new String("key");
        WeakReference<Flyweight> ref = new WeakReference<>(FlyweightFactory.get(key));
        assertNotNull(ref.get());
        key = null;

        assertTimeout(Duration.ofSeconds(1), () -> {
            // use WeakHashMap#size to call WeakHashMap#expungeStaleEntries
            while (FlyweightFactory.size() != 0 || ref.get() != null) {
                System.gc();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}