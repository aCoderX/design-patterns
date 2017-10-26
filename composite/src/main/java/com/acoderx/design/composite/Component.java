package com.acoderx.design.composite;

import java.util.List;
import java.util.Map;

/**
 * Created by xudi on 2017/7/9.
 */
public abstract class Component {
    void add(Component component){
        throw new UnsupportedOperationException();
    }
    void remove(Component component){
        throw new UnsupportedOperationException();
    }
    String getName(){
        throw new UnsupportedOperationException();
    }
    Object getSimple(){
        throw new UnsupportedOperationException();
    }
    List<Component> getChild(){
        throw new UnsupportedOperationException();
    }
    Map<String,Object> info(){
        throw new UnsupportedOperationException();
    }
}
