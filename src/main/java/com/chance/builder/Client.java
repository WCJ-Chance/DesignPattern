package com.chance.builder;

import com.chance.builder.builder.Builder;
import com.chance.builder.builder.HelloBikeBuilder;
import com.chance.builder.builder.MobikeBuilder;
import com.chance.builder.director.Director;
import com.chance.builder.product.Bike;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike mobike = director.constrcutor();
        System.out.println(mobike.getFrame() + "----" + mobike.getSeat());
    }
}
