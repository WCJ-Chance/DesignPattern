package com.chance.singleton.lazy.doublecheck;

public class Lazy04 {
    private Lazy04() {}

    // volatile：保证变量可见性，屏蔽指令重排
    private volatile static Lazy04 instance;

    public static Lazy04 getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段；否则，进入抢锁阶段。
        if (instance == null) {
            synchronized (Lazy04.class) {
                // 第二次判断，如果instance为null，创建实例！
                if (instance == null)
                    instance = new Lazy04();
            }
        }
        return instance;
    }
}
