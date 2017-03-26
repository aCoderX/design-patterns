package com.acoderx.design.singleton;

import org.junit.Test;

/**
 * Created by xudi on 17-3-26.
 */
public class EnumSingletonTest {
    @Test
    public void getInstance() throws Exception {
        new SingletonTest<EnumSingleton>(() -> {return EnumSingleton.getInstance();}).test();
    }


}