package com.acoderx.design.bridge;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Square implements Shape {
    private final Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.println("正方形:"+color.getInfo());
    }
}
