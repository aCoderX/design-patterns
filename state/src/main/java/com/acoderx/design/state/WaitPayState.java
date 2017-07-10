package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 状态：待支付
 */
public class WaitPayState extends State {
    @Override
    void createQrCode() {
        System.out.println("生成二维码");
    }

    @Override
    void charge() {
        System.out.println("确认支付");
    }
}
