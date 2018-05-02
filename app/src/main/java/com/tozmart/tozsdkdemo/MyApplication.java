package com.tozmart.tozsdkdemo;

import android.app.Application;

import com.tozmart.toz_sdk.ui.TozSDK;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TozSDK.init(this);
    }
}
