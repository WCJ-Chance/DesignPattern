package com.chance.factory.method.product;

public class ProductB implements Product{
    static {
        System.out.println("productB is produced!");
    }
}
