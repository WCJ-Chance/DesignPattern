package com.chance.flyweight.example01;

/**
 * 非共享的具体享元类
 */
public class UnsharedFlyweight extends Flyweight{
    private String inState;

    public UnsharedFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("--- 使用非共享对象，内部状态： " + inState + ", 外部状态： " + state);
    }
}
