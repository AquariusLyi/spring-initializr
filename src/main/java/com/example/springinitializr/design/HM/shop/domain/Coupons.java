package com.example.springinitializr.design.HM.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.domain.Coupons
 ****/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Coupons implements Serializable {
    private String id;
    private String username;
    private Integer money;
    private Integer status;  //状态，1：未使用，2：已使用
    private Date useTime;    //使用时间
}
