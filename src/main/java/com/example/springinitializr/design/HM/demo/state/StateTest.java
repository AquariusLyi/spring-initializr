package com.example.springinitializr.design.HM.demo.state;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.state.StateTest
 ****/
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
