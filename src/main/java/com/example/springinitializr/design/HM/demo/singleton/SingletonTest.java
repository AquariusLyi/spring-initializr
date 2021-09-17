package com.example.springinitializr.design.HM.demo.singleton;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.util.ArrayList;
import java.util.List;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singleton.SingletonTest
 ****/
public class SingletonTest {

    public static void main1(String[] args) {
        //存储创建的新实例对象
        List<SingleModel> array = new ArrayList<SingleModel>();
        
        //获取实例
        SingleModel singleModel1 = SingleModel.getInstance();
        array.add(singleModel1);

        for (int i = 0; i <100000 ; i++) {
            SingleModel singleModel2 = SingleModel.getInstance();
            if(singleModel1!=singleModel2){
                array.add(singleModel2);
            }
        }
        System.out.println(RamUsageEstimator.sizeOf(array));
    }


    public static void main(String[] args) {
        //存储创建的新实例对象
        List<Cat> array = new ArrayList<Cat>();

        //获取实例
        Cat cat1 = new Cat();
        array.add(cat1);

        for (int i = 0; i <100000 ; i++) {
            Cat cat2 = new Cat();
            if(cat2!=cat1){
                array.add(cat2);
            }
        }
        System.out.println(RamUsageEstimator.sizeOf(array));
    }
}
