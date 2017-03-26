package com.acoderx.design.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xudi on 17-3-26.
 */
public class InnerSingletonTest {
    @Test
    public void getInstance() throws Exception {
        new SingletonTest<InnerSingleton>(() -> {return InnerSingleton.getInstance();}).test();
    }

}