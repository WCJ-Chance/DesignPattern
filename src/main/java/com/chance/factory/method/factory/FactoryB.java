package com.chance.factory.method.factory;

import com.chance.factory.method.product.Product;
import com.chance.factory.method.product.ProductB;

public class FactoryB implements Factory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
