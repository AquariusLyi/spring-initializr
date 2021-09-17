package com.example.springinitializr.design.HM.shop.controller;

import com.example.springinitializr.design.HM.shop.proxy.FileUploadProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.controller.FileController
 ****/
@RestController
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private FileUploadProxy fileUploadProxy;

    /***
     * 文件上传
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/upload")
    public String upload(MultipartFile file) throws Exception {
        return fileUploadProxy.upload(file);
    }
}
