package com.acoderx.design.chain;

/**
 * Description:
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public class ConcreteHandlerLeader extends Handler {

    public ConcreteHandlerLeader(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getCommand().equals(Request.RequestType.MANAGE)) {
            System.out.println("leader do something...");
            return;
        }else {
            this.getNextHandler().handleRequest(request);
        }
    }
}
