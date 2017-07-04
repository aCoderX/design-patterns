package com.acoderx.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xudi on 2017/7/3.
 */
public class SubjectDemo implements Subject {
    private List<Observer> observers;

    private String notice;
    public SubjectDemo(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notice);
        }
    }

    public void somethingChanged(String notice){
        this.notice = notice;
        notifyObservers();
    }

}
