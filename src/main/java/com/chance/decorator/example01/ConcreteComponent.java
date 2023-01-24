package com.chance.decorator.example01;

/**
 * 具体构建类（被装饰的类）
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        // 基础功能的实现，一些复杂功能通过装饰类进行扩展
    }
}
