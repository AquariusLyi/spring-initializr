package com.example.springinitializr.design.HM.demo.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.IceTea
 ****/
public class IceTea implements Tea {

    //最原始的方法，需要对它进行扩展
    @Override
    public void making() {
        System.out.println("制作一杯冰冻的水！");
    }
}
