package com.chance.singleton.enumm;

/**
 * 单例模式---枚举法
 * 1. 阻止反射对单例唯一性的破坏： 不允许使用反射对枚举对象进行创建
 * 2. 组织序列化的破坏：在序列化的时候，仅仅是将枚举对象的name属性输出到了结果中，反序列化的时候，就会通过Enum的valueOf方法来根据名字去查找
 *    对应枚举对象。
 */
public enum Singleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
