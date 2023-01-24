package com.chance.proxy.staticc;

public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("OPERATION！");
    }
}
