package com.chance.singleton.lazy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestLazy02 {
    @Test
    public void testSingleton() {
        Lazy02 instance1 = Lazy02.getInstance();
        Lazy02 instance2 = Lazy02.getInstance();
        System.out.println(instance1 == instance2);
    }

    // Lazy02由于给getInstance方法加了锁，因而解决了线程不安全的问题
    @Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Lazy02> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Lazy02 instance = Lazy02.getInstance();
                synchronized (list) {
                    list.add(instance);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Set<Lazy02> set = new HashSet<>(list);
        System.out.println(set);
    }
}
