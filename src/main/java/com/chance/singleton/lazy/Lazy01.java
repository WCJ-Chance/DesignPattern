package com.chance.singleton.lazy;

public class Lazy01 {

    // 1. 私有构造方法
    private Lazy01() {}

    // 2. 创建私有静态对象
    private static Lazy01 instance;

    // 3. 创建全局访问点
    public static Lazy01 getInstance() {
        if (instance == null) // 线程不安全！
            instance = new Lazy01();
        return instance;
    }
}
