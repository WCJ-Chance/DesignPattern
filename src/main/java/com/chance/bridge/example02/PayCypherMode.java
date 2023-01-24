package com.chance.bridge.example02;

public class PayCypherMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付->风控校验->密码信息");
        return true;
    }
}
