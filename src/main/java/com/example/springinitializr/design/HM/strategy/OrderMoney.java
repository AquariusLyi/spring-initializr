package com.example.springinitializr.design.HM.strategy;

import org.omg.CORBA.INTERNAL;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.strategy.OrderMoney
 ****/
public class OrderMoney {

    //将策略接口作为属性
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //价格计算
    public Integer moneySum(Integer money){
        return strategy.money(money);
    }
}
