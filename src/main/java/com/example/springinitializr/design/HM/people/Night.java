package com.example.springinitializr.design.HM.people;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.people.Night
 ****/
public class Night implements State {

    //改变状态
    @Override
    public void change(People people, State state) {
        people.setState(state);
    }

    @Override
    public void execute() {
        System.out.println("晚上要睡觉！");
    }
}
