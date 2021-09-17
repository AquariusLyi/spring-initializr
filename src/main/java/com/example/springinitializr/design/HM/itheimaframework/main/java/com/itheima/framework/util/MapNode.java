package com.example.springinitializr.design.HM.itheimaframework.main.java.com.itheima.framework.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.util.MapNode
 ****/
public class MapNode {

    //唯一ID
    private String id;
    //classname
    private String classname;

    //节点
    private Map<String,String> propertyMap;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, String> propertyMap) {
        if(this.propertyMap==null){
            this.propertyMap=new HashMap<String,String>();
        }
        this.propertyMap.putAll(propertyMap);
    }

    @Override
    public String toString() {
        return "MapNode{" +
                "id='" + id + '\'' +
                ", classname='" + classname + '\'' +
                ", propertyMap=" + propertyMap +
                '}';
    }
}
