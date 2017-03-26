package com.acoderx.design.singleton;

/**
 * Created by xudi on 17-3-26.
 * 内部静态枚举实现单例(目前最为安全的单例)
 */
public class EnumSingleton {
    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private EnumSingleton instance;
        //jvm保证只调用一次
        Singleton(){
            instance = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return instance;
        }

    }
}
