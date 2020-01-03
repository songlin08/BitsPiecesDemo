package com.lin.design_patterns.strategy;

/**
 * 抽象算法的策略类，定义所有支持的算法的公共接口
 */
public abstract class CashSuper {

    /**
     * 算法方法
     */
    public abstract double acceptCash(double money);
}
