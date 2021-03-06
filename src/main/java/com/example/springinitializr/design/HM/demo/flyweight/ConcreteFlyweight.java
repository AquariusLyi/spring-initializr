package com.example.springinitializr.design.HM.demo.flyweight;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.flyweight.ConcreteFlyweight
 ****/
public class ConcreteFlyweight extends Flyweight {

    //接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:"+extrinsic);
    }
}
