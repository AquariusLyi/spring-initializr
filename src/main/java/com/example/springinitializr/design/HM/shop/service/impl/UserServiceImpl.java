package com.example.springinitializr.design.HM.shop.service.impl;


import com.example.springinitializr.design.HM.shop.domain.User;
import com.example.springinitializr.design.HM.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.service.impl.UserServiceImpl
 ****/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /***
     * 登录
     * @param username
     * @return
     */
    @Override
    public User findByUserName(String username) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM `user` WHERE username=?",new BeanPropertyRowMapper<User>(User.class),username);
        } catch (Exception e) {
        }
        return null;
    }
}
