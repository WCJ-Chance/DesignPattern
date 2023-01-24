package com.chance.factory.simple.factory;

import com.chance.factory.simple.product.Product;
import com.chance.factory.simple.product.ProductA;
import com.chance.factory.simple.product.ProductB;
import com.chance.factory.simple.product.ProductC;

public class Factory {
    public static Product getProduct(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default: {
                System.err.println("Some problem occurred.");
                System.exit(1);
            }
        }
        return null;
    }
}
