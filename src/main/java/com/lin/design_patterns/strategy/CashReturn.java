package com.lin.design_patterns.strategy;

/**
 * 活动3：返利活动，输入返利条件和返利值，
 *       比如满300返100，moneyCoditation为300，moneyReturn为100。
 */
public class CashReturn extends CashSuper {

    private double moneyConditation = 0.0;    //返利条件
    private double moneyReturn = 0.0d;    //返利值

    public CashReturn(double moneyConditation, double moneyReturn) {
        this.moneyConditation = moneyConditation;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money > moneyConditation){
            // 意思为，如果当前金额大于等于返利条件，则使用当前金额减去返利值
            result = money - Math.floor(money / moneyConditation) * moneyReturn;
        }
        return result;
    }
}
