package com.example.springinitializr.design.HM.demo.observer;

import java.util.ArrayList;
import java.util.List;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.observer.Clock
 * 闹钟
 ****/
public class Clock {

    //一对多，需要接到通知的对象
    private List<AbstrackInfo> infos = new ArrayList<AbstrackInfo>();

    public void say(){
        System.out.println("上班了！");
        //通知
        update();
    }

    //添加要得到通知的对象
    public void addInfo(AbstrackInfo info){
        infos.add(info);
    }

    //通知
    public void update(){
        for (AbstrackInfo info : infos) {
            info.message();
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        AbstrackInfo eat = new EatInfo();
        AbstrackInfo sp = new SleepInfo();

        clock.addInfo(eat);
        clock.addInfo(sp);

        clock.say();
    }
}
