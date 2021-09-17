package com.example.springinitializr.design.HM.shop.user;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.user.SessionShare
 ****/
public class SessionShare extends Session {

    //构造函数
    public SessionShare(String username, String name, String sex, String role, Integer level) {
        super(username, name, sex, role, level);
    }

    //额外功能实现
    @Override
    public void handler() {
        System.out.println("要共享用户信息了！");
    }
}
