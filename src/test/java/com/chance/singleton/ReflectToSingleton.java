package com.chance.singleton;

import com.chance.singleton.hungry.Hungry;
import com.chance.singleton.hungry.HungryAntiReflect;
import com.chance.singleton.lazy.Lazy02;
import com.chance.singleton.lazy.Lazy02AntiReflect;
import com.chance.singleton.lazy.doublecheck.Lazy03;
import com.chance.singleton.lazy.doublecheck.Lazy04;
import com.chance.singleton.lazy.doublecheck.Lazy04AntiReflect;
import com.chance.singleton.lazy.innerclass.Lazy05;
import com.chance.singleton.lazy.innerclass.Lazy05AntiReflect;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射对于单例的破坏
 * 反射机制：在运行状态中，对于任意一个类都能够知道这个类的属性和方法，对于任一个对象都能调用其属性和方法，动态的获取信息！
 */
public class ReflectToSingleton {
    @Test
    public static void testSingleton(Class<?> classObj) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> singletonClass = classObj;
        Constructor<?> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true); // 即可对类中的私有成员进行操作
        Object instance1 = constructor.newInstance();
        Object instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /**
         * 1. 私有构造方法未经处理反射机制的情形：
         * 可选参数： Hungry.class Lazy02.class Lazy04.class Lazy05.class
         *
         * 2. 私有构造方法处理反射机制之后的情形：
         * 可选参数： HungryAntiReflect.class Lazy02AntiReflect.class Lazy04AntiReflect.class Lazy05AntiReflect.class
         */
//        Lazy05AntiReflect instance = Lazy05AntiReflect.getInstance();
        // 枚举类无法由反射创建实例
        testSingleton(HungryAntiReflect.class);
    }
}
