package com.chance.proxy.staticc;

public class ProxySubject implements Subject {
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void operation() {
        System.out.println("开启事务");
        this.realSubject.operation();
        System.out.println("提交事务");
    }
}
