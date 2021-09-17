package com.example.springinitializr.design.HM.shop.decorator;


import com.example.springinitializr.design.HM.shop.dao.ItemDao;
import com.example.springinitializr.design.HM.shop.domain.Item;
import com.example.springinitializr.design.HM.shop.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.OrderMoneySum
 ****/
@Component(value = "orderMoneySum")
public class OrderMoneySum implements MoneySum{

    @Autowired
    private ItemDao itemDao;

    /****
     * 基础价格计算
     * @param order
     */
    @Override
    public void money(Order order) {
        //查询商品
        Item item = itemDao.findById(order.getItemId());

        //商品价格*购买数量
        order.setMoney(item.getPrice()*order.getNum());   //订单价格
        order.setPaymoney(item.getPrice()*order.getNum());//结算价格
    }
}
