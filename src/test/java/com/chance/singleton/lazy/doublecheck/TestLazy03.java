package com.chance.singleton.lazy.doublecheck;

import com.chance.singleton.lazy.doublecheck.Lazy03;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestLazy03 {

    @Test
    public void testSingleton() {
        Lazy03 instance1 = Lazy03.getInstance();
        Lazy03 instance2 = Lazy03.getInstance();
        System.out.println(instance2 == instance1);
    }

    // 会存在出错的情况，由于JVM指令重排的机制
    @Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Lazy03> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Lazy03 instance = Lazy03.getInstance();
                synchronized (list) {
                    list.add(instance);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Set<Lazy03> set = new HashSet<>(list);
        System.out.println(set);
    }
}
