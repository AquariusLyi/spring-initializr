package com.example.springinitializr.design.HM.demo.tenet.seven.news;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.GoodsService
 ****/
public class GoodsService {
    private GoodsDao goodsDao;
    private OrderDao orderDao;

    public void modify(){
        goodsDao.modify();
        orderDao.add();
    }
}
