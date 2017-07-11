package com.acoderx.design.strategy;

/**
 * Created by xudi on 2017/7/11.
 */
public class Context {
    private StrategyInterface strategy;
    public void method(){
        strategy.calculate();
    }
    public void setStrategy(StrategyInterface strategy){
        this.strategy = strategy;
    }
}
