package com.acoderx.design.simplefactory;

/**
 * Description:工厂
 *
 * @author xudi
 * @since 2018-11-30
 */
public class FruitFactory {
    public static Fruit getFruit(String type) {
        if ("apple".equals(type)) {
            return new Apple();
        } else if ("orange".equals(type)) {
            return new Orange();
        }else {
            return null;
        }
    }
}
