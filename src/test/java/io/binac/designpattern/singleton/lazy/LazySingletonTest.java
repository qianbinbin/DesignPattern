package io.binac.designpattern.singleton.lazy;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {
    private static final int EXECUTION_COUNT1 = 100000000;

    private static final int POOL_SIZE = 9;

    private static final int EXECUTION_COUNT2 = 100000;

    private long executeRepeatedly(Runnable runnable) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < EXECUTION_COUNT1; ++i) {
            runnable.run();
        }
        return System.currentTimeMillis() - start;
    }

    @Test
    void testPerformance() {
        System.out.println("Simple lazy singleton cost "
                + executeRepeatedly(SimpleLazySingleton::getInstance) + " milliseconds");
        System.out.println("Synchronized singleton cost "
                + executeRepeatedly(SyncedSingleton::getInstance) + " milliseconds");
        System.out.println("Double-checked locking singleton cost "
                + executeRepeatedly(DoubleCheckedLockingSingleton::getInstance) + " milliseconds");
        System.out.println("Nested holder singleton cost "
                + executeRepeatedly(NestedHolderSingleton::getInstance) + " milliseconds");
    }

    private void executeConcurrently(Runnable runnable) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                POOL_SIZE, POOL_SIZE, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>()
        );
        executor.prestartAllCoreThreads();
        for (int i = 0; i < EXECUTION_COUNT2; i++) {
            executor.execute(runnable);
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testConcurrency() {
        executeConcurrently(SimpleLazySingleton::getInstance);
        System.out.println("For simple lazy singleton, the number of creation is "
                + SimpleLazySingleton.getNumberOfCreation());

        executeConcurrently(SyncedSingleton::getInstance);
        assertEquals(1, SyncedSingleton.getNumberOfCreation());

        executeConcurrently(DoubleCheckedLockingSingleton::getInstance);
        assertEquals(1, DoubleCheckedLockingSingleton.getNumberOfCreation());

        executeConcurrently(NestedHolderSingleton::getInstance);
        assertEquals(1, NestedHolderSingleton.getNumberOfCreation());
    }
}