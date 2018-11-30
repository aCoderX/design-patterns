package com.acoderx.design.templatemethod;

/**
 * Created by xudi on 2017/7/7.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void methodA() {
        System.out.println("do A");
    }

    @Override
    protected void methodB() {
        System.out.println("do B");
    }

    @Override
    protected boolean hock() {
        return true;
    }
}
