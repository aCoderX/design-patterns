package com.acoderx.design.facade;

/**
 * Created by xudi on 2017/7/6.
 * 外观类，将调用者与子系统解耦，使得接口显得简单，但是如果不能直接调用子系统功能的强大
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    public void methed(){
        subSystemA.methedA();
        subSystemB.methedB();
    }
}
