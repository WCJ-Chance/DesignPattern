package com.chance.singleton.lazy.doublecheck;

import java.io.Serializable;

public class Lazy04AntiSerializable implements Serializable {
    private Lazy04AntiSerializable() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问！");
    }

    // volatile：保证变量可见性，屏蔽指令重排
    private volatile static Lazy04AntiSerializable instance;

    public static Lazy04AntiSerializable getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段；否则，进入抢锁阶段。
        if (instance == null) {
            synchronized (Lazy04AntiSerializable.class) {
                // 第二次判断，如果instance为null，创建实例！
                if (instance == null)
                    instance = new Lazy04AntiSerializable();
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
