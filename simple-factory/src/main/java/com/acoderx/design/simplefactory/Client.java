package com.acoderx.design.simplefactory;

/**
 * Description:简单工厂
 *
 * @author xudi
 * @since 2018-11-30
 */
public class Client {
    public static void main(String[] args){
        Fruit apple = FruitFactory.getFruit("apple");
        System.out.println(apple.getTaste());
        Fruit orange = FruitFactory.getFruit("orange");
        System.out.println(orange.getTaste());
    }
}
