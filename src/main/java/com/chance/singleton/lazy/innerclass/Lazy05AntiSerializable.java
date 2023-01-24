package com.chance.singleton.lazy.innerclass;


import java.io.Serializable;

public class Lazy05AntiSerializable implements Serializable {
    private Lazy05AntiSerializable() {
        if (SingletonHandler.instance != null)
            throw new RuntimeException("不允许非法访问");
    }

    private static class SingletonHandler {
        // 在静态内部类中创建单例，只有在装载内部类的时候，才会创建单例！
        private static Lazy05AntiSerializable instance = new Lazy05AntiSerializable();
    }

    public static Lazy05AntiSerializable getInstance() {
        return SingletonHandler.instance;
    }

    private Object readResolve() {
        return SingletonHandler.instance;
    }
}
