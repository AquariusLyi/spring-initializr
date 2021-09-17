package com.example.springinitializr.design.HM.shop.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.user.Session
 ****/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Session {
    private String username;
    private String name;
    private String sex;
    private String role;
    private Integer level;

    //额外操作
    public abstract void handler();
}
