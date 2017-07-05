package com.acoderx.design.command;

/**
 * Created by xudi on 2017/7/5.
 * 一个命令的具体实现，类比于遥控器某一个按钮发出的控制信号
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(){}

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
