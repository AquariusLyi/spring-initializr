package com.example.springinitializr.design.HM.demo.tenet.seven.news;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.OrderService
 ****/
public class OrderService {

    private OrderDao orderDao;
    private LogDao logDao;

    public void add(){
        orderDao.add();
        logDao.recode();
    }
}
