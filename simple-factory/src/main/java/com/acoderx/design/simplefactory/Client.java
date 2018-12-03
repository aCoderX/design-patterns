package com.acoderx.design.simplefactory;

/**
 * Description:简单工厂
 *
 * @author xudi
 * @since 2018-11-30
 */
public class Client {
    public static void main(String[] args){
        Mouse hp = MouseFactory.createMouse("hp");
        System.out.println(hp.getName());
        Mouse dell = MouseFactory.createMouse("dell");
        System.out.println(dell.getName());
    }
}
