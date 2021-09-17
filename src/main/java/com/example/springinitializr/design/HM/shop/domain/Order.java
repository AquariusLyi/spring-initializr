package com.example.springinitializr.design.HM.shop.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.domain.Order
 ****/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {
    private String itemId;
    private String id;
    private Integer money;
    private Integer paymoney;
    private Integer status;
    private Integer num;
    private String username;
    private String couponsId;
}