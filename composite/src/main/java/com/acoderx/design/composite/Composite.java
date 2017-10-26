package com.acoderx.design.composite;

import java.util.*;

/**
 * Created by xudi on 2017/7/9.
 */
public class Composite extends Component {
    private String name;
    private ParamType type = ParamType.OBJECT;
    private String description;
    private boolean require;

    public Composite(String name, String description, boolean require, Object simple) {
        this.name = name;
        this.description = description;
        this.require = require;
    }

    ArrayList<Component> list = new ArrayList();
    @Override
    void add(Component component) {
        list.add(component);
    }

    @Override
    void remove(Component component) {
        list.remove(component);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    Object getSimple() {
        Map<String, Object> simpleMap = new TreeMap<>();
        Iterator<Component> iterable = list.iterator();
        while(iterable.hasNext()){
            Component component = iterable.next();
            simpleMap.put(component.getName(), component.getSimple());
        }
        return simpleMap;
    }

    @Override
    List<Component> getChild() {
        return list;
    }

    @Override
    Map<String, Object> info() {
        Map<String, Object> map = new TreeMap<>();
        map.put("type", type.getDescription());
        map.put("description", description);
        map.put("require", require);
        map.put("simple", getSimple());
        Iterator<Component> iterable = list.iterator();
        Map<String, Object> childMap = new TreeMap<>();
        while(iterable.hasNext()){
            Component component = iterable.next();
            childMap.put(component.getName(), component.info());
        }
        map.put("child", childMap);
        return map;
    }
}
