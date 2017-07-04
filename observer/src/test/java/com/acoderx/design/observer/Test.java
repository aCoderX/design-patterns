package com.acoderx.design.observer;

/**
 * Created by xudi on 2017/7/3.
 */
public class Test {
    public static void main(String[] args){
        SubjectDemo subject = new SubjectDemo();

        Observer observer1 = new ObserverDemo1(subject);
        Observer observer2 = new ObserverDemo1(subject);

        subject.somethingChanged("This is a notice");

    }
}
