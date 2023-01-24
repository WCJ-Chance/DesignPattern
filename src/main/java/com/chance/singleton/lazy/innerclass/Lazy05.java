package com.chance.singleton.lazy.innerclass;


/**
 * 静态内部类是懒加载
 * 根据静态内部类的特性，同时解决了延时加载、线程安全的问题，并且代码更加简洁！
 */
public class Lazy05 {
    private Lazy05() {}

    private static class SingletonHandler {
        // 在静态内部类中创建单例，只有在装载内部类的时候，才会创建单例！
        private static Lazy05 instance = new Lazy05();
    }

    public static Lazy05 getInstance() {
        return SingletonHandler.instance;
    }
}
