package com.acoderx.design.observer;

/**
 * Created by xudi on 2017/7/3.
 * 主题
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
