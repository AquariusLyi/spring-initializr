package com.example.springinitializr.design.HM.strategy;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.strategy.Vip1
 ****/
public class Vip2 implements Strategy {

    //Vip2 用户
    @Override
    public Integer money(Integer money) {
        return money-5;
    }
}
