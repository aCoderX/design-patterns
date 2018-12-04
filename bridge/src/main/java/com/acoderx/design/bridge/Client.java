package com.acoderx.design.bridge;

/**
 * Description:桥接模式，把继承转换成组合
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Client {
    public static void main(String[] args){
        Shape shape = new Square(new RedColor());
        shape.printInfo();
    }
}
