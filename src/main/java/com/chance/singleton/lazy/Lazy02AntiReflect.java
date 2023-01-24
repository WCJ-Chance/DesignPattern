package com.chance.singleton.lazy;

public class Lazy02AntiReflect {

    private Lazy02AntiReflect() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问");
    }

    private static Lazy02AntiReflect instance;

    // 此处，给整个方法加锁，会降低并发度！
    // 用双重校验去优化，见Lazy03，缩小同步代码块的范围！
    public synchronized static Lazy02AntiReflect getInstance() {
        if (instance == null)
            instance = new Lazy02AntiReflect();
        return instance;
    }
}
