package com.acoderx.design.factorymethod;

/**
 * Description:工厂方法模式
 * 把类的实例化延迟到了子类中，让工厂子类来决定实例化哪个类
 *
 * @author xudi
 * @since 2018-12-03
 */
public class Client {
    public static void main(String[] args){
        MouseFactory factory = new DellMouseFactory();
        Mouse mouse = factory.createMouse();
        System.out.println(mouse.getName());
    }
}
