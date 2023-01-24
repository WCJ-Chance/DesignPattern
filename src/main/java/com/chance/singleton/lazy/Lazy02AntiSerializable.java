package com.chance.singleton.lazy;

import java.io.Serializable;

public class Lazy02AntiSerializable implements Serializable {

    private Lazy02AntiSerializable() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问");
    }

    private static Lazy02AntiSerializable instance;

    // 此处，给整个方法加锁，会降低并发度！
    // 用双重校验去优化，见Lazy03，缩小同步代码块的范围！
    public synchronized static Lazy02AntiSerializable getInstance() {
        if (instance == null)
            instance = new Lazy02AntiSerializable();
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
