package com.chance.factory.method.factory;

import com.chance.factory.method.product.Product;
import com.chance.factory.method.product.ProductA;

public class FactoryA implements Factory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
