package com.acoderx.design.composite;

/**
 * Created by xudi on 2017/7/9.
 */
public enum ParamType {
    STRING("string"), INT("int"), OBJECT("object"),LIST("list"), DOUBLE("double");

    private String description;

    ParamType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    }
