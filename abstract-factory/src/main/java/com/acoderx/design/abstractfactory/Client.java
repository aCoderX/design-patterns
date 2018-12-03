package com.acoderx.design.abstractfactory;

/**
 * Description:抽象方法模式
 * 单个产品的抽象工厂就是工厂方法模式
 *
 * @author xudi
 * @since 2018-12-03
 */
public class Client {
    public static void main(String[] args){
        PcFactory factory = new HpFactory();
        Keyboard keyboard = factory.createKeyboard();
        Mouse mouse = factory.createMouse();
        System.out.println(keyboard.getKeyboardName());
        System.out.println(mouse.getMouseName());
    }
}
