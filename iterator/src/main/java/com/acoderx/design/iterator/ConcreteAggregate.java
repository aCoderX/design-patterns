package com.acoderx.design.iterator;

/**
 * Created by xudi on 2017/7/9.
 * 相当于arraylist
 */
public class ConcreteAggregate<T> implements Aggregate<T>{
    private static final int MAX_SIZE=10;
    private Object[] items;
    private int size;
    public ConcreteAggregate(){
        items = new Object[MAX_SIZE];
    }
    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }

    @Override
    public void add(T value) {
        if(size<MAX_SIZE){
            items[size]=value;
            size++;
        }
    }
}
