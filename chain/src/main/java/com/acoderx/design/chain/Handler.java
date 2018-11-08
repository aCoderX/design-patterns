package com.acoderx.design.chain;

/**
 * Description:
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request){
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    };
}
