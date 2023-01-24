package com.chance.factory.abstractt.factory;

import com.chance.factory.abstractt.product.*;

public class FactoryB implements Factory{

    @Override
    public ProductA getProductA(String productName) {
        System.err.println("FactoryB only produces ProductB");
        return null;
    }

    @Override
    public ProductB getProductB(String productName) {
        switch (productName) {
            case "B1":
                return new ProductB1();
            case "B2":
                return new ProductB2();
            default: {
                System.err.println("Some problem occurred when FactoryB being producing ProductB");
                System.exit(1);
            }
        }
        return null;
    }
}
