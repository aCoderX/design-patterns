package com.acoderx.design.composite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by xudi on 2017/7/9.
 */
public class Client {
    public static void main(String[] args){

        Component item = new Composite("test","一级父节点",true,"ss");
        Component subItem1 = new Composite("test2.1","二级父节点",true,"haha");
        Component subItem2 = new Leaf("test3",ParamType.INT,"三级节点",true,"dice");
        subItem1.add(subItem2);
        Component subItem3 = new Leaf("test2.2",ParamType.STRING,"二级节点",true,"sjsjsj");
        item.add(subItem1);
        item.add(subItem3);

        System.out.println(objectToString(item.info()));
    }
    private static String objectToString(Object o){
        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
