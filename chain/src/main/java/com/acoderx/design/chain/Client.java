package com.acoderx.design.chain;

/**
 * Description:责任链模式
 *
 * 与装饰者模式的区别：
 *  装饰者模式注重类的功能的增加了；责任链模式更注重把调用者和执行者解耦，调用者不需要知道具体执行者，
 *  而且责任链模式可以在执行链中断开，而装饰者会一直执行
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public class Client {
    public static void main(String[] args){
        Request request = new Request(Request.RequestType.MANAGE);
        Handler handler = new ConcreteHandlerBoss(new ConcreteHandlerLeader(new ConcreteHandlerStaff(null)));
        handler.handleRequest(request);
    }
}
