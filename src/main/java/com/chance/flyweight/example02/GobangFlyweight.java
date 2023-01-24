package com.chance.flyweight.example02;

/**
 * 抽象享元类： 五子棋
 */
public abstract class GobangFlyweight {

    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}
