package com.acoderx.design.singleton;

/**
 * Created by xudi on 17-3-26.
 * 静态内部类实现单例
 */
public class InnerSingleton {
    private InnerSingleton(){}

    private static class Singleton{
        private static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return Singleton.instance;
    }

}
