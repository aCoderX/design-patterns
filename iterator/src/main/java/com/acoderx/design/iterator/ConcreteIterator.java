package com.acoderx.design.iterator;

/**
 * Created by xudi on 2017/7/9.
 * 相当于arrayList中的Itr
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private Object[] items;
    private int position = 0;

    public ConcreteIterator(){}
    public ConcreteIterator(Object[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public T next() {
        @SuppressWarnings("unchecked")
        T item = (T) items[position];
        position++;
        return item;
    }
}
