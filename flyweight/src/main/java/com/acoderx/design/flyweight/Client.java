package com.acoderx.design.flyweight;

/**
 * Description:享元模式，将大对象缓存下来重复使用
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Client {
    public static void main(String[] args){
        FruitFactory fruitFactory = new FruitFactory();
        System.out.println(fruitFactory.createFruit(FruitType.APPLE));
        System.out.println(fruitFactory.createFruit(FruitType.APPLE));
        System.out.println(fruitFactory.createFruit(FruitType.ORANGE));
        System.out.println(fruitFactory.createFruit(FruitType.ORANGE));
    }
}
