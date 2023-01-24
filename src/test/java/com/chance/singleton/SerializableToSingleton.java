package com.chance.singleton;

import com.chance.singleton.enumm.Singleton;
import com.chance.singleton.hungry.Hungry;
import com.chance.singleton.hungry.HungryAntiSerializable;
import com.chance.singleton.lazy.Lazy02;
import com.chance.singleton.lazy.Lazy02AntiSerializable;
import com.chance.singleton.lazy.doublecheck.Lazy04AntiSerializable;
import com.chance.singleton.lazy.innerclass.Lazy05AntiSerializable;
import org.junit.Test;

import java.io.*;

public class SerializableToSingleton {
    @Test
    public void testHungry() throws IOException, ClassNotFoundException {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(HungryAntiSerializable.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungryAntiSerializable instance1 = (HungryAntiSerializable) ois.readObject();

        HungryAntiSerializable instance2 = HungryAntiSerializable.getInstance();

        System.out.println(instance1 == instance2);
    }

    @Test
    public void testLazy02() throws IOException, ClassNotFoundException {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Lazy02AntiSerializable.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Lazy02AntiSerializable instance1 = (Lazy02AntiSerializable) ois.readObject();

        Lazy02AntiSerializable instance2 = Lazy02AntiSerializable.getInstance();

        System.out.println(instance1 == instance2);
    }

    @Test
    public void testLazy04() throws IOException, ClassNotFoundException {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Lazy04AntiSerializable.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Lazy04AntiSerializable instance1 = (Lazy04AntiSerializable) ois.readObject();

        Lazy04AntiSerializable instance2 = Lazy04AntiSerializable.getInstance();

        System.out.println(instance1 == instance2);
    }

    @Test
    public void testLazy05() throws IOException, ClassNotFoundException {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Lazy05AntiSerializable.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Lazy05AntiSerializable instance1 = (Lazy05AntiSerializable) ois.readObject();

        Lazy05AntiSerializable instance2 = Lazy05AntiSerializable.getInstance();

        System.out.println(instance1 == instance2);
    }

    @Test
    public void testEnumSingleton() throws IOException, ClassNotFoundException {
        // 序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Singleton.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton instance1 = (Singleton) ois.readObject();

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
