package com.chance.factory;

import com.chance.factory.abstractt.factory.Factory;
import com.chance.factory.abstractt.factory.FactoryA;
import com.chance.factory.abstractt.product.ProductA;

public class Client {
    public static void main(String[] args) {
        // 简单工厂
//        Product p = SimpleFactory.getProduct("C");

        // 工厂方法
//        Factory factoryA = new FactoryA();
//        Product productA = factoryA.getProduct();

//        Factory factoryB = new FactoryB();
//        Product productB = factoryB.getProduct();

        // 抽象工厂
        Factory factoryA = new FactoryA();
        ProductA pa = factoryA.getProductA("A2");

    }
}
