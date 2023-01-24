package com.chance.singleton.lazy.doublecheck;

public class Lazy04AntiReflect {
    private Lazy04AntiReflect() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问！");
    }

    // volatile：保证变量可见性，屏蔽指令重排
    private volatile static Lazy04AntiReflect instance;

    public static Lazy04AntiReflect getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段；否则，进入抢锁阶段。
        if (instance == null) {
            synchronized (Lazy04AntiReflect.class) {
                // 第二次判断，如果instance为null，创建实例！
                if (instance == null)
                    instance = new Lazy04AntiReflect();
            }
        }
        return instance;
    }
}
