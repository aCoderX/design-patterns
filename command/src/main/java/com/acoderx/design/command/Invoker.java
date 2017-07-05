package com.acoderx.design.command;

/**
 * Created by xudi on 2017/7/5.
 * 类比于遥控器
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
