package com.acoderx.design.adapter;

/**
 * Created by xudi on 2017/7/6.
 * 调用者
 */
public class Client {
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());
        target.charge();
    }
}
