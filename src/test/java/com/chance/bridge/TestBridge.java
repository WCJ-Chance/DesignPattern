package com.chance.bridge;

import com.chance.bridge.example01.PayController;
import com.chance.bridge.example02.PayChannel;
import com.chance.bridge.example02.PayFaceMode;
import com.chance.bridge.example02.WxPay;
import org.junit.Test;

import java.math.BigDecimal;

public class TestBridge {
    @Test
    public void test01() {
        PayController payController = new PayController();
        System.out.println("测试: 微信支付 ---> 人脸支付方式");
        payController.doPay("wx_001", "100010000", new BigDecimal(100), 1, 2);

        System.out.println("支付宝: 支付宝支付 ---> 指纹支付方式");
        payController.doPay("zfb_001", "200020000", new BigDecimal(100), 2, 3);
    }
    @Test
    public void test02() {
        System.out.println("测试场景1： 微信支付，人脸方式");
        PayChannel pay = new WxPay(new PayFaceMode());
        pay.transfer("wx_001", "10010", new BigDecimal(10000));
    }
}
