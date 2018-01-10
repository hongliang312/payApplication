package com.example.usercenter;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 知足 on 2018/1/10.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

       //  用于全局配置初始化Fresco 图片加载
        Fresco.initialize(this);
    }
}
