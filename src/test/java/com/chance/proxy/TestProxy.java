package com.chance.proxy;

import com.chance.proxy.dynamic.jdk.ProxyFactory;
import com.chance.proxy.dynamic.cglib.User;
import com.chance.proxy.dynamic.cglib.UserLogProxy;
import com.chance.proxy.dynamic.cglib.UserServiceImpl;
import com.chance.proxy.staticc.ProxySubject;
import com.chance.proxy.staticc.RealSubject;
import com.chance.proxy.staticc.Subject;
import org.junit.Test;

import java.util.List;

public class TestProxy {
    @Test
    public void testStaticProxy() {
        // 目标类
        Subject s = new RealSubject();

        // 代理对象
        ProxySubject proxy = new ProxySubject(s);

        proxy.operation();
    }

    @Test
    public void testDynamicProxy() {
        Subject s = new RealSubject();
        System.out.println(s.getClass());

        Subject proxyInstance = (Subject) new ProxyFactory(s).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.operation();

        while (true) {}
    }

    @Test
    public void testCglibProxy() {
        // 目标对象
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());

        // 代理对象
        UserServiceImpl proxy = (UserServiceImpl) new UserLogProxy().getLogProxy(userService);
        System.out.println(proxy.getClass());

        List<User> userList = proxy.findUserList();
        System.out.println("用户信息： " + userList);
    }
}
