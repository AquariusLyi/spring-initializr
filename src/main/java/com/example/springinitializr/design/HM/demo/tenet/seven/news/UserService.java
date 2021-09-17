package com.example.springinitializr.design.HM.demo.tenet.seven.news;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.UserService
 ****/
public class UserService {

    private UserDao userDao;
    private LogDao logDao;

    public void modify(){
        userDao.modify();
        logDao.recode();
    }
}
