package com.chance.singleton.lazy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestLazy01 {

    @org.junit.Test
    public void testSingleton() {
        Lazy01 instance1 = Lazy01.getInstance();
        Lazy01 instance2 = Lazy01.getInstance();
        System.out.println(instance2 == instance1);
    }

    //多次执行，你会看到set中有两个对象，这说明单例的唯一性被破坏了
    @org.junit.Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Lazy01> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Lazy01 instance = Lazy01.getInstance();
                synchronized (list) {
                    list.add(instance);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Set<Lazy01> set = new HashSet<>(list);
        System.out.println(set);
    }
}
