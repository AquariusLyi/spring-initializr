package com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework;


import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.factory.BeanFactory;
import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.factory.XmlBeanFactory;
import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.parse.ParseFile;
import com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.parse.ParseXml;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.InputStream;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.BaseInit
 ****/
public class BaseInit extends HttpServlet {

    //解析Controller里面的@RequestMapping注解，找到注解的值，并且记录注解的值(uri)和方法的映射关系
    //public static Map<String,Method> methods;

    //加载文件的对象
    private ParseFile parseFile;

    //工厂对象
    public BeanFactory beanFactory;

    //初始化操作
    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            //获取要解析的文件
            String conf = config.getInitParameter("contextLocation");

            //通知ParseFile加载文件
            if(conf!=null){
                InputStream is = BaseInit.class.getClassLoader().getResourceAsStream(conf);
                parseFile = new ParseXml();
                parseFile.load(is);

                //实例化工厂
                beanFactory = new XmlBeanFactory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
