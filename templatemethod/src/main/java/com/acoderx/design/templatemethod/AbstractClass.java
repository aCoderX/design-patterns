package com.acoderx.design.templatemethod;

/**
 * Created by xudi on 2017/7/7.
 */
public abstract class AbstractClass {
    /**
     * 模板方法，组织整体算法
    * */
    public void templateMethod() {
        methodA();
        methodB();
        if(hock()){
            System.out.println("do something else");
        }
    }
    protected abstract void methodA();
    protected abstract void methodB();
    protected boolean hock(){
        return false;
    }
}
