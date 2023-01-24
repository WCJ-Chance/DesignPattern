package com.chance.singleton.lazy.innerclass;

import com.chance.singleton.lazy.innerclass.Lazy05;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TestInnerClass {
    @Test
    public void testSingleton() {
        Lazy05 instance1 = Lazy05.getInstance();
        Lazy05 instance2 = Lazy05.getInstance();
        System.out.println(instance2 == instance1);
    }

    @Test
    public void testMultiThread() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        List<Lazy05> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Lazy05 instance = Lazy05.getInstance();
                synchronized (list) {
                    list.add(instance);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Set<Lazy05> set = new HashSet<>(list);
        System.out.println(set);
    }
}
