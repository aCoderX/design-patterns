package com.acoderx.design.templatemethod;

/**
 * Created by xudi on 2017/7/7.
 */
public class Client {
    public static void main(String[] args){
        AbstractClass test = new ConcreteClass();
        test.templateMethod();
    }
}
