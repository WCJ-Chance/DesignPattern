package com.chance.flyweight.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * 生产五子棋棋子
 */
public class GobangFlyweightFactory {
    //享元池
    private Map<String, GobangFlyweight> pool;

    // 创建共享享元对象，设置对象的内部状态
    private GobangFlyweightFactory() {
        this.pool = new HashMap<>();

        GobangFlyweight black = new BlackGobang();
        GobangFlyweight white = new WhiteGobang();

        pool.put("b", black);
        pool.put("w", white);
    }

    // 获取唯一享元工厂对象的方法
    public static GobangFlyweightFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //静态内部类
    private static class SingletonHolder {
        private static final GobangFlyweightFactory INSTANCE = new GobangFlyweightFactory();

    }

    // 通过key获取集合中的享元对象
    public GobangFlyweight getGobang(String key) {
        return pool.get(key);
    }
}
