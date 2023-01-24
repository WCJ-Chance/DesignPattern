package com.chance.factory.abstractt.factory;


import com.chance.factory.abstractt.product.ProductA;
import com.chance.factory.abstractt.product.ProductB;

public interface Factory {
    public ProductA getProductA(String productName);
    public ProductB getProductB(String productName);
}
