package com.example.springinitializr.design.HM.shop.service.impl;


import com.example.springinitializr.design.HM.shop.dao.ItemDao;
import com.example.springinitializr.design.HM.shop.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.service.impl.ItemServiceImpl
 ****/
@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    /***
     * 修改库存
     */
    @Override
    public int modify(Integer count, String id){
        int modifyCount = itemDao.modify(count,id);
        return modifyCount;
    }

}
