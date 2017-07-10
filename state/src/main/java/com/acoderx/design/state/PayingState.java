package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 状态：支付中
 */
public class PayingState extends State {
    @Override
    void charge() {
        System.out.println("确认支付");
    }
}
