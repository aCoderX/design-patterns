package com.acoderx.design.adapter;

/**
 * Created by xudi on 2017/7/6.
 * adaptee的适配器
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(){}

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void charge() {
        adaptee.doSelfCharge();
    }
}
