package com.chance.builder.director;

import com.chance.builder.builder.Builder;
import com.chance.builder.product.Bike;

/**
 * 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike constrcutor() {
        builder.buildFrame();
        builder.buildSeat();
        System.out.println("产品制作成功！");
        return builder.createBike();
    }
}
