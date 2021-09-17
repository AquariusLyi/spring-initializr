package com.example.springinitializr.design.HM.shop.decorator;


import com.example.springinitializr.design.HM.shop.domain.Order;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.FullMoneySum
 ****/
@Component(value = "fullMoneySum")
public class FullMoneySum extends DecoratorMoneySum {

    //价格计算
    @Override
    public void money(Order order) {
        //被增强的对象方法调用
        super.money(order);

        //执行增强
        fullMoney(order);
    }


    //满100 减10块
    public void fullMoney(Order order){
        if(order.getMoney()>=100){
            order.setPaymoney(order.getPaymoney()-10);
        }
    }
}
