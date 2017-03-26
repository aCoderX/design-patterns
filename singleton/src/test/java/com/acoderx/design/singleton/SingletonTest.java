package com.acoderx.design.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * Created by xudi on 17-3-26.
 */
public class SingletonTest<T> {

    private Supplier<T> singletonSupplier;
    public SingletonTest(Supplier<T> singletonSupplier){
        this.singletonSupplier = singletonSupplier;
    }

    public void test(){
        T singleton1 = singletonSupplier.get();
        T singleton2 = singletonSupplier.get();
        T singleton3 = singletonSupplier.get();
        Assert.assertSame(singleton1,singleton2);
        Assert.assertSame(singleton2,singleton3);
        Assert.assertSame(singleton3,singleton1);
    }
}
