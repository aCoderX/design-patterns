package com.acoderx.design.singleton;

/**
 * Created by xudi on 17-3-26.
 * 懒汉模式
 */
public class LazySingleton {
    //volatile为了确保修改对内存的可见
    private static volatile LazySingleton instance;
    private LazySingleton(){}

    //可以传入参数进行构造
    //只有未初始化的时候需要加锁，所以不应该在整个方法上加锁
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                //双重检验锁，防止其他线程在未能获得锁的时候进入了第一个if导致多次初始化
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}