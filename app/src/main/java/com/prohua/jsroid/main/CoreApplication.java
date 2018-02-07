package com.prohua.jsroid.main;

import android.app.Application;

/**
 * 主类
 * Created by Deep on 2017/11/10 0010.
 */

public class CoreApplication extends Application {

    private static CoreApplication instance;

    public static CoreApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }
}
