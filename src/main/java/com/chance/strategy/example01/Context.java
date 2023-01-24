package com.chance.strategy.example01;

/**
 * 上下文类： 策略模式的本质就是通过Context作为控制单元，对不同的策略进行调度分配
 */
public class Context {
    // 维持一个抽象策略的引用
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
