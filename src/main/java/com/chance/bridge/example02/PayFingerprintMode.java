package com.chance.bridge.example02;

public class PayFingerprintMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付->风控校验->指纹信息");
        return true;
    }
}
