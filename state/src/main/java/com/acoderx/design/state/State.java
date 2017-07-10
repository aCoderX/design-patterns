package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 状态抽象类，定义了可能发生的行为
 */
public abstract class State {
    /**
     * 创建订单
     */
    void createOrder(){
        throw new UnsupportedOperationException();
    }

    /**
     * 生成二维码
     */
    void createQrCode(){
        throw new UnsupportedOperationException();
    }

    /**
     * 确认支付
     */
    void charge(){
        throw new UnsupportedOperationException();
    }

}
