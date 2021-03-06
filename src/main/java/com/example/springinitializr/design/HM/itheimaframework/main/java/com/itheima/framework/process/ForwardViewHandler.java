package com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.process.ForwardViewHandler
 ****/
public class ForwardViewHandler implements ViewHandler {

    //转发
    @Override
    public void forward(HttpServletRequest request, HttpServletResponse response, Object result) {
        try {
            request.getRequestDispatcher(result.toString()).forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
