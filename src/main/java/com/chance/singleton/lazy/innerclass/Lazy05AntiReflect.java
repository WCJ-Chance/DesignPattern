package com.chance.singleton.lazy.innerclass;


public class Lazy05AntiReflect {
    private Lazy05AntiReflect() {
        if (SingletonHandler.instance != null)
            throw new RuntimeException("不允许非法访问");
    }

    private static class SingletonHandler {
        // 在静态内部类中创建单例，只有在装载内部类的时候，才会创建单例！
        private static Lazy05AntiReflect instance = new Lazy05AntiReflect();
    }

    public static Lazy05AntiReflect getInstance() {
        return SingletonHandler.instance;
    }
}
