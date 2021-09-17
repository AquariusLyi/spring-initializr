package com.example.springinitializr.design.HM.shop.decorator;


import com.example.springinitializr.design.HM.shop.domain.Order;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.DecoratorMoneySum
 ****/
public abstract class DecoratorMoneySum implements MoneySum {

    //被扩展的对象
    private MoneySum moneySum;

    public void setMoneySum(MoneySum moneySum) {
        this.moneySum = moneySum;
    }

    //价格计算
    @Override
    public void money(Order order) {
        moneySum.money(order);
    }
}
