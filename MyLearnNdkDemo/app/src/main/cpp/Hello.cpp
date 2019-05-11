//
// Created by mypc on 2019-01-26.
//
#include "com_nwpu_mylearnndkdemo_Hello.h"
JNIEXPORT jstring JNICALL Java_com_nwpu_mylearnndkdemo_Hello_sayHello
        (JNIEnv *env, jclass){
    return  env->NewStringUTF("I am coming from C++");
}
