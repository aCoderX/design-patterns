package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 调用者
 */
public class Client {
    public static void main(String[] args){
        Context context = new Context();
        context.createOrder();
        context.pay(Context.PayChannelEnum.CASH);

        context = new Context();
        context.createOrder();
        context.pay(Context.PayChannelEnum.ALIPAY);
        context.scanPay();
    }
}
