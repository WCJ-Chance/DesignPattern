package com.chance.strategy.example02.service;

import com.chance.strategy.example02.entity.Receipt;

/**
 * 抽象策略类
 */
public interface ReceiptHandlerStrategy {
    void handleReceipt(Receipt receipt);
}
