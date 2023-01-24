package com.chance.factory.simple.product;

public class ProductC implements Product{
    static {
        System.out.println("ProductC is produced!");
    }
}
