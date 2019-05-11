//
// Created by mypc on 2019-02-02.
//
#include"com_nwpu_ndkbulidtest_JniUtils.h"
JNIEXPORT jstring JNICALL Java_com_nwpu_ndkbulidtest_JniUtils_getName
                            (JNIEnv *env, jclass obj){
                            return env->NewStringUTF("这是个jni测试");
                            }
