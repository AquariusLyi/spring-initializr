package com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.factory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.factory.BeanFactory
 ****/
public interface BeanFactory {


    /***
     * 1、根据uri获取实例
     */
    Object getUrlBean(String uri);


    /***
     * 2、根据id获取实例
     */
    Object getBean(String id);
}
