package com.chance.singleton.hungry;

import java.io.Serializable;

public class HungryAntiSerializable implements Serializable {
    // 1. 私有构造方法
    private HungryAntiSerializable() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问！");
    }

    // 2. 创建私有静态对象
    private static HungryAntiSerializable instance = new HungryAntiSerializable();

    // 3. 创建全局访问点
    public static HungryAntiSerializable getInstance() {
        return instance;
    }

    // 解决序列化对单例破坏的问题
    private Object readResolve() {
        return instance;
    }
}
