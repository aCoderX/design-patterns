package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 状态：待收费
 */
public class WaitOrderState extends State {
    @Override
    void createOrder() {
        System.out.println("创建订单");
    }
}
