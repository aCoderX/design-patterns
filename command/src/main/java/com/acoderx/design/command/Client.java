package com.acoderx.design.command;

/**
 * Created by xudi on 2017/7/5.
 * 创建命令，并设置命令的接受者，类比于人
 */
public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
