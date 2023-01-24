package com.chance.proxy.dynamic.cglib;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl {
    // 查询用户
    public List<User> findUserList() {

        return Collections.singletonList(new User("Chance", 25));
    }
}
