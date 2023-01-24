package com.chance.factory.simple.product;

public class ProductA implements Product{
    static {
        System.out.println("ProductA is produced!");
    }
}
