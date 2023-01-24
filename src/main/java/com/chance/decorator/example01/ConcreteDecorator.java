package com.chance.decorator.example01;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation(); // 调用原有的业务方法
        add();// 调用新增的业务方法
    }

    public void add() {

    }
}
