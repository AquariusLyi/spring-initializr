package com.example.springinitializr.design.HM.observer;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.observer.AbstrackInfo
 ****/
public abstract class AbstrackInfo {

    //被监听的对象
    private Clock clock;

    abstract  void message();
}
