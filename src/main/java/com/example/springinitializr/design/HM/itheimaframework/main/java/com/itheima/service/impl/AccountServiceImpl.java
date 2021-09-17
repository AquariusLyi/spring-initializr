package com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.service.impl;


import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.dao.AccountDao;
import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.service.AccountService;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.service.impl.AccountServiceImpl
 ****/
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public String one() {
        System.out.println("AccountServiceImpl.one()方法执行");
        return accountDao.one();
    }
}
