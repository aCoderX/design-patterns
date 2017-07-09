package com.acoderx.design.iterator;

/**
 * Created by xudi on 2017/7/9.
 * 集合接口，相当于collection
 */
public interface Aggregate<T>{
    Iterator<T> createIterator();
    void add(T value);
}
