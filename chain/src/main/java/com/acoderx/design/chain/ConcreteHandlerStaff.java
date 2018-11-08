package com.acoderx.design.chain;

/**
 * Description:
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public class ConcreteHandlerStaff extends Handler {

    public ConcreteHandlerStaff(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getCommand().equals(Request.RequestType.WORK)) {
            System.out.println("staff do something...");
            return;
        }else {
            this.getNextHandler().handleRequest(request);
        }
    }
}
