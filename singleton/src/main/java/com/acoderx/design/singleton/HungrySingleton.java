package com.acoderx.design.singleton;

/**
 * Created by xudi on 17-3-26.
 * 饿汉模式
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    /*
    * 重写默认构造方法，防止被外界实例化
    * */
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
