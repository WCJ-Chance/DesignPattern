package com.chance.singleton.hungry;

public class HungryAntiReflect {
    // 1. 私有构造方法
    private HungryAntiReflect() {
        if (instance != null)
            throw new RuntimeException("不允许非法访问！");
    }

    // 2. 创建私有静态对象
    private static HungryAntiReflect instance = new HungryAntiReflect();

    // 3. 创建全局访问点
    public static HungryAntiReflect getInstance() {
        return instance;
    }
}
