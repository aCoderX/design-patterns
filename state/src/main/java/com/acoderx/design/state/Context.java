package com.acoderx.design.state;

/**
 * Created by xudi on 2017/7/10.
 * 状态管理
 */
public class Context {

    enum PayChannelEnum{
        ALIPAY,CASH
    }

    private State waitOrder = new WaitOrderState();
    private State waitPay = new WaitPayState();
    private State paying = new PayingState();
    private State paid = new PaidState();


    private State state = waitOrder;

    public void createOrder(){
        state.createOrder();
        state = waitPay;
    }

    public void pay(PayChannelEnum type){
        if(PayChannelEnum.ALIPAY.equals(type)){
            state.createQrCode();
            state = paying;
        }else{
            state.charge();
            state = paid;
        }
    }

    public void scanPay(){
        state.charge();
        state = paid;
    }


}
