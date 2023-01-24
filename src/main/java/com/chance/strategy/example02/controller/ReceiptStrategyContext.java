package com.chance.strategy.example02.controller;

import com.chance.strategy.example02.entity.Receipt;
import com.chance.strategy.example02.service.ReceiptHandlerStrategy;

/**
 * 上下文类，持有策略接口，决定执行哪一个具体的策略类
 */
public class ReceiptStrategyContext {
    private ReceiptHandlerStrategy receiptHandlerStrategy;

    public void setReceiptHandlerStrategy(ReceiptHandlerStrategy receiptHandlerStrategy) {
        this.receiptHandlerStrategy = receiptHandlerStrategy;
    }

    //调用策略类中的方法
    public void handleReceipt(Receipt receipt) {
        if (receipt != null) {
            receiptHandlerStrategy.handleReceipt(receipt);
        }
    }
}
