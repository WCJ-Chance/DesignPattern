package com.chance.bridge.example02;

import java.math.BigDecimal;

public class ZfbPay extends PayChannel{
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付划账开始~");
        boolean security = payMode.security(uId);
        System.out.println("支付宝渠道支付风险校验： " + uId + ", " + tradeId + ", " + security);
        if (!security) {
            System.out.println("支付宝渠道支付划账失败！！");
            return "500";
        }

        System.out.println("支付宝渠道支付划账成功， 金额： " + amount);
        return "200";
    }
}
