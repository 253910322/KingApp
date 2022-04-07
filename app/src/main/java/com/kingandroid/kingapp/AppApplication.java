package com.kingandroid.kingapp;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import androidx.annotation.NonNull;

import com.kingandroid.utils.ScreenSizeUtils;

/*
*当应用程序开始运行的时候，AppApplication 会被实例化，这里可以创建状态变化和全局资源
* 但是一般不这么做，保存静态对象一般都是自己创建，不从Application继承，因为需要考虑到生命周期的事情。
* */
public class AppApplication extends Application {
    private static AppApplication singleton;
    private String TAG = "AppApplication";

    public static AppApplication getInstance(){

        return singleton;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate AppApplication Object ");
        super.onCreate();
        singleton = this;
    }

    @Override
    public void onLowMemory() {
        Log.d(TAG, "onLowMemory AppApplication Object ");
        super.onLowMemory();
    }

    /*
    *onTrimMemory的特定于应用程序的替代选择，当运行时决定当前应用程序应该减少其内存开销时被调用
    * 比如这里我们打开应用之后，按下home建，将应用切换到后台就可以触发此函数的调用
    * */
    @Override
    public void onTrimMemory(int level) {
        Log.d(TAG, "onTrimMemory AppApplication Object ");
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged AppApplication Object ");
        super.onConfigurationChanged(newConfig);
    }
}
