package com.example.springinitializr.design.HM.shop.decorator;


import com.example.springinitializr.design.HM.shop.domain.Order;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.MoneSum
 ****/
public interface MoneySum {

    /***
     * 订单价格[结算]运算
     */
    void money(Order order);

}
