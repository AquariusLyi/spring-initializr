package com.example.springinitializr.design.HM.demo.people;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.people.StateTest
 ****/
public class StateTest {

    public static void main(String[] args) {
        //创建一个对象
        People people = new People();

        //创建一个状态
        State dayTime = new DayTime();
        //改变对象的状态
        dayTime.change(people,dayTime);
        //执行相关行为
        people.getState().execute();

        //Night
        State night = new Night();
        night.change(people,night);

        //执行相关行为
        people.getState().execute();
    }
}
