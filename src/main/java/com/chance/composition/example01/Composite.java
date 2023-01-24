package com.chance.composition.example01;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 树枝节点
 *      容器对象，既可以包含树枝节点，又可以包含叶子结点
 */
public class Composite extends Component{

    // 定义集合属性，保存子节点的信息
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    // 具体业务方法
    @Override
    public void operation() {
        // 循环调用其它节点中的operation方法
        for (Component c : list
             ) {
            c.operation();
        }
    }
}
