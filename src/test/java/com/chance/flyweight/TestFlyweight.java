package com.chance.flyweight;

import com.chance.flyweight.example01.Flyweight;
import com.chance.flyweight.example01.FlyweightFactory;
import com.chance.flyweight.example01.UnsharedFlyweight;
import com.chance.flyweight.example02.GobangFlyweight;
import com.chance.flyweight.example02.GobangFlyweightFactory;
import org.junit.Test;

public class TestFlyweight {
    @Test
    public void test01() {
        //获取工厂对象
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        //通过工厂对象获取共享的享元对象
        Flyweight f1 = flyweightFactory.getFlyweight("A");
        f1.operation("f1ExState");
        Flyweight f2 = flyweightFactory.getFlyweight("A");
        f2.operation("f2ExState");

        System.out.println(f1 == f2);

        // 获取非共享享元对象
        UnsharedFlyweight a1 = new UnsharedFlyweight("A");
        UnsharedFlyweight a2 = new UnsharedFlyweight("B");
        System.out.println(a1 == a2);
    }

    @Test
    public void test02() {
        GobangFlyweightFactory factory = GobangFlyweightFactory.getInstance();
        // 获取三颗黑子
        GobangFlyweight b1 = factory.getGobang("b");
        GobangFlyweight b2 = factory.getGobang("b");
        GobangFlyweight b3 = factory.getGobang("b");
        System.out.println("判断黑子是否是同一对象： " + (b1 == b2));

        // 获取三颗白子
        GobangFlyweight w1 = factory.getGobang("w");
        GobangFlyweight w2 = factory.getGobang("w");
        GobangFlyweight w3 = factory.getGobang("w");
        System.out.println("判断白子是否是同一对象： " + (w1 == w2));

        b1.display();
        b2.display();
        b3.display();

        w1.display();
        w2.display();
        w3.display();
    }
}
