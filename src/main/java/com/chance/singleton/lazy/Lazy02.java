package com.chance.singleton.lazy;

public class Lazy02 {

    private Lazy02() {}

    private static Lazy02 instance;

    // 此处，给整个方法加锁，会降低并发度！
    // 用双重校验去优化，见Lazy03，缩小同步代码块的范围！
    public synchronized static Lazy02 getInstance() {
        if (instance == null)
            instance = new Lazy02();
        return instance;
    }
}
