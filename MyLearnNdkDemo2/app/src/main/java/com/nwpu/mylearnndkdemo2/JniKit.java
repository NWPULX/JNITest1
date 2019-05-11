package com.nwpu.mylearnndkdemo2;
public class JniKit {

    /**如果你的native方法报错，没关系，配置完成自然会编译通过
     * @param num
     * @return
     */
    static
    {
        System.loadLibrary("JniDemo");
    }
    public static native int calculate(int num);

}