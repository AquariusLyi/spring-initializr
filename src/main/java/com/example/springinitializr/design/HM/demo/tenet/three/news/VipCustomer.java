package com.example.springinitializr.design.HM.demo.tenet.three.news;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.three.old.VipCustomer
 ****/
public class VipCustomer extends Customer {

    @Override
    public String sefInfo() {
        return "给VIP客户发消息，客户名字：" + super.getName() + ",客户手机号："+super.getPhone();
    }
}
