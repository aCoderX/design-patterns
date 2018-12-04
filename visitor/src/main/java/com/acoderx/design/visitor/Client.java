package com.acoderx.design.visitor;

/**
 * Description:访问者模式
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Client {
    public static void main(String[] args){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVistor());
    }
}
