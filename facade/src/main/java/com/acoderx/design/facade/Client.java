package com.acoderx.design.facade;

/**
 * Created by xudi on 2017/7/6.
 * 调用者
 */
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methed();
    }
}
