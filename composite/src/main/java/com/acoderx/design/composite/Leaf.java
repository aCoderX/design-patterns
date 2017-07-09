package com.acoderx.design.composite;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by xudi on 2017/7/9.
 */
public class Leaf extends Component {
    private String name;
    private ParamType type;
    private String description;
    private boolean require;
    private Object simple;

    public Leaf(String name, ParamType type, String description, boolean require, Object simple) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.require = require;
        this.simple = simple;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    Map<String,Object> info() {
        Map<String, Object> map = new TreeMap<>();
        map.put("type", type.getDescription());
        map.put("description", description);
        map.put("require", require);
        map.put("simple", simple);
        return map;
    }
}
