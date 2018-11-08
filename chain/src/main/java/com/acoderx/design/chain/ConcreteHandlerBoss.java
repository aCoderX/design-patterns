package com.acoderx.design.chain;

/**
 * Description:
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public class ConcreteHandlerBoss extends Handler {

    public ConcreteHandlerBoss(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getCommand().equals(Request.RequestType.MONEY)) {
            System.out.println("boss do something...");
            return;
        }else {
            this.getNextHandler().handleRequest(request);
        }
    }
}
