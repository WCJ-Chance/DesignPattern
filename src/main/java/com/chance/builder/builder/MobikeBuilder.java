package com.chance.builder.builder;

import com.chance.builder.product.Bike;

/**
 * 摩拜单车建造者类
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        System.out.println("制作摩拜单车车架");
        bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作摩拜单车车座");
        bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
