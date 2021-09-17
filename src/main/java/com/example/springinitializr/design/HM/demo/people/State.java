package com.example.springinitializr.design.HM.demo.people;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.people.State
 ****/
public interface State {

    /***
     * 改变状态
     * @param people：要改变状态的对象
     * @param state：变更成指定的状态
     */
    void change(People people,State state);

    //执行的行为
    void execute();
}
