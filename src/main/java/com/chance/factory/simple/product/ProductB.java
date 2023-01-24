package com.chance.factory.simple.product;

public class ProductB implements Product{
    static {
        System.out.println("ProductB is produced!");
    }
}
