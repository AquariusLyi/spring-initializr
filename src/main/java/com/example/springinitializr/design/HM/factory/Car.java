package com.example.springinitializr.design.HM.factory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.factory.Car
 ****/
public class Car implements Product {
    @Override
    public void show() {
        System.out.println("汽车：比亚迪！");
    }
}
