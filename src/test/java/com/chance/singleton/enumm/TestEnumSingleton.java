package com.chance.singleton.enumm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestEnumSingleton {
    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance1);
    }

    @Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Singleton> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Singleton instance = Singleton.getInstance();
            synchronized (list) {
                list.add(instance);
            }
            countDownLatch.countDown();
        }
        countDownLatch.await();
        Set<Singleton> set = new HashSet<>(list);
        System.out.println(set);
    }
}
