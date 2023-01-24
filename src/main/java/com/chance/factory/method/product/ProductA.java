package com.chance.factory.method.product;

public class ProductA implements Product{
    static {
        System.out.println("productA is produced!");
    }
}
