package com.acoderx.design.strategy;

/**
 * Created by xudi on 2017/7/11.
 */
public class ConcreteStrategyA implements StrategyInterface {
    @Override
    public void calculate() {
        System.out.println("使用加法");
    }
}
