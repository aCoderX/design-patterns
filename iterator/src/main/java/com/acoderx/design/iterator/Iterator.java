package com.acoderx.design.iterator;

/**
 * Created by xudi on 2017/7/9.
 * 相当于util包中的Iterator
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
    default void remove(){
        throw new UnsupportedOperationException("remove");
    }
}
