package com.chance.factory.abstractt.factory;

import com.chance.factory.abstractt.product.ProductA;
import com.chance.factory.abstractt.product.ProductA1;
import com.chance.factory.abstractt.product.ProductA2;
import com.chance.factory.abstractt.product.ProductB;

public class FactoryA implements Factory{
    @Override
    public ProductA getProductA(String productName) {
        switch (productName) {
            case "A1":
                return new ProductA1();
            case "A2":
                return new ProductA2();
            default: {
                System.err.println("Some problem occurred when FactoryA being producing ProductA");
            }
        }
        return null;
    }

    @Override
    public ProductB getProductB(String productName) {
        System.err.println("FactoryA only produces ProductA");
        return null;
    }
}
