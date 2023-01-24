package com.chance.builder.builder;

import com.chance.builder.product.Bike;

/**
 * 哈啰单车建造者类
 */
public class HelloBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        System.out.println("制作哈啰单车车架");
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作哈啰单车车座");
        bike.setSeat("橡胶");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
