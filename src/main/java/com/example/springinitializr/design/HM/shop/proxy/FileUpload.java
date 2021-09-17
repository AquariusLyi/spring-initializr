package com.example.springinitializr.design.HM.shop.proxy;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.proxy.FileUpload
 ****/
public interface FileUpload {

    /****
     * 文件上传
     */
    String upload(byte[] buffers , String extName);
}
