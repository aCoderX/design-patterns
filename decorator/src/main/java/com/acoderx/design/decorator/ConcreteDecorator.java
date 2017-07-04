package com.acoderx.design.decorator;

/**
 * Created by xudi on 2017/7/4.
 * 装饰器的具体实现，类似BufferedInputStream
 */
public class ConcreteDecorator extends Decorator {
    private Component component;
    public ConcreteDecorator(){}
    public ConcreteDecorator(Component component){
        this.component = component;
    }
    @Override
    public int countNum() {
        return component.countNum() + 5;
    }
}
