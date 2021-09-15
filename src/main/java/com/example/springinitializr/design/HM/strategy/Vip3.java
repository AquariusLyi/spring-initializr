package com.example.springinitializr.design.HM.strategy;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.strategy.Vip1
 ****/
public class Vip3 implements Strategy {

    //Vip3 用户
    @Override
    public Integer money(Integer money) {
        return (int)(money*0.5);
    }
}
