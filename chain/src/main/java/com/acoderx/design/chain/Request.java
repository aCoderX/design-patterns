package com.acoderx.design.chain;

/**
 * Description:
 *
 * @author: xudi
 * @since: 2018-11-08
 */
public class Request {
    public Request(RequestType command) {
        this.command = command;
    }

    public enum RequestType{
        MONEY,MANAGE,WORK
    }

    private RequestType command;

    public RequestType getCommand() {
        return command;
    }

    public void setCommand(RequestType command) {
        this.command = command;
    }
}
