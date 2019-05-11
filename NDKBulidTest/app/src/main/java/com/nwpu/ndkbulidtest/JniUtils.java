package com.nwpu.ndkbulidtest;

/**
 * Created by mypc on 2019-02-02.
 */

public class JniUtils {
    static {
        System.loadLibrary("JNIDemo");
    }
    public static native String getName();
}
