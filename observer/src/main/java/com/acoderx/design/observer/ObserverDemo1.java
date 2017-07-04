package com.acoderx.design.observer;

/**
 * Created by xudi on 2017/7/3.
 */
public class ObserverDemo1 implements Observer, DisplayElement {

    Subject subject;
    private String notice;

    public ObserverDemo1(){}

    public ObserverDemo1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(notice);
    }

    @Override
    public void update(String notice) {
        this.notice = notice;
        display();
    }
}
