package com.example.springinitializr.design.HM.shop.service;


import com.example.springinitializr.design.HM.shop.domain.User;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.service.UserService
 ****/
public interface UserService {
    /***
     * 根据用户名查询登录
     * @param username
     * @return
     */
    User findByUserName(String username);
}
