LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := JNIDemo
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	D:\Android\NDKBulidTest\app\src\main\jni\com_nwpu_ndkbulidtest_JniUtils.cpp \

LOCAL_C_INCLUDES += D:\Android\NDKBulidTest\app\src\debug\jni
LOCAL_C_INCLUDES += D:\Android\NDKBulidTest\app\src\main\jni

include $(BUILD_SHARED_LIBRARY)
