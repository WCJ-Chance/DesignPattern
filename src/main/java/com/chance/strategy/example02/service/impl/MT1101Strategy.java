package com.chance.strategy.example02.service.impl;

import com.chance.strategy.example02.entity.Receipt;
import com.chance.strategy.example02.service.ReceiptHandlerStrategy;

/**
 * 具体策略类
 */
public class MT1101Strategy implements ReceiptHandlerStrategy {
    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文 MT1101: " + receipt.getMessage());
    }
}
