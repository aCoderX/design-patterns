package com.acoderx.design.builder;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-11-28
 */
public class Client {
    public static void main(String[] args){
        System.out.println(Person.builder().withAge(1).withName("xd").build().toString());
    }
}
