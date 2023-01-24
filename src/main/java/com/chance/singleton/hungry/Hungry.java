package com.chance.singleton.hungry;

public class Hungry {
    // 1. 私有构造方法
    private Hungry() {}

    // 2. 创建私有静态对象
    private static Hungry instance = new Hungry();

    // 3. 创建全局访问点
    public static Hungry getInstance() {
        return instance;
    }
}
