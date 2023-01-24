package com.chance.singleton.lazy.doublecheck;

import com.chance.singleton.lazy.doublecheck.Lazy04;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestLazy04 {

    @Test
    public void testSingleton() {
        Lazy04 instance1 = Lazy04.getInstance();
        Lazy04 instance2 = Lazy04.getInstance();
        System.out.println(instance2 == instance1);
    }


    @Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Lazy04> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Lazy04 instance = Lazy04.getInstance();
                synchronized (list) {
                    list.add(instance);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Set<Lazy04> set = new HashSet<>(list);
        System.out.println(set);
    }
}
