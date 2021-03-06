package com.example.springinitializr.design.HM.demo.state;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.state.StopState
 ****/
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
