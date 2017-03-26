package com.acoderx.design.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xudi on 17-3-26.
 */
public class LazySingletonTest {
    @Test
    public void getInstance() throws Exception {
        new SingletonTest<LazySingleton>(() -> {return LazySingleton.getInstance();}).test();
    }

}