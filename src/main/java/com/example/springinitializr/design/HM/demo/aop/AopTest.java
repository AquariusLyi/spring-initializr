package com.example.springinitializr.design.HM.demo.aop;


import com.example.springinitializr.design.HM.demo.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.aop.AopTest
 ****/
public class AopTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = (UserService) act.getBean("userService");
        userService.add();

    }
}
