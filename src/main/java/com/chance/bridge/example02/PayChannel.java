package com.chance.bridge.example02;

import java.math.BigDecimal;

public abstract class PayChannel {

    protected IPayMode payMode;

    public PayChannel(IPayMode payMode) {
        this.payMode = payMode;
    }

    // 划账
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
