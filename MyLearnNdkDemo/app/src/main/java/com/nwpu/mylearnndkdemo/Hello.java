package com.nwpu.mylearnndkdemo;

/**
 * Created by mypc on 2019-01-26.
 */
public class Hello {
    static {
        System.loadLibrary("hello");
    }
    public static native String sayHello();
}
