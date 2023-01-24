package com.chance.bridge.example02;

public class PayFaceMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        System.out.println("人脸识别支付->风控校验->人脸信息");
        return true;
    }
}
