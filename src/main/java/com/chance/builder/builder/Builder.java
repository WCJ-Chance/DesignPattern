package com.chance.builder.builder;

import com.chance.builder.product.Bike;

/**
 * 抽象构建者类
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
