package com.chance.singleton.lazy.doublecheck;

public class Lazy03 {
    private Lazy03() {}

    private static Lazy03 instance;

    public static Lazy03 getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段；否则，进入抢锁阶段。
        if (instance == null) {
            synchronized (Lazy03.class) {
                // 第二次判断，如果instance为null，创建实例！
                if (instance == null)
                    instance = new Lazy03();
                /**
                 * 也有问题：
                 * 上面的创建对象的代码，在JVM中会被分为三步：
                 * 1. 分配内存空间
                 * 2. 初始化对象
                 * 3. 将instance对象指向分配好的内存空间
                 *
                 * JVM可能会对上面的指令顺序进行重排：
                 * 1 -> 3 -> 2
                 * 这种情况下，instance将是个半成品对象，会报错！
                 *
                 * 解决：
                 * 使用volatile修饰instance，保证变量可见性，屏蔽指令重排
                 * 见Lazy04
                 */
            }
        }
        return instance;
    }
}
