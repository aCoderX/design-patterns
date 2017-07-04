package com.acoderx.design.decorator;

/**
 * Created by xudi on 2017/7/4.
 */
public class Test {
    public static void main(String[] args){
        Component component = new ConcreteDecorator(new ConcreteComponent());
        System.out.println(component.countNum());
    }
}
