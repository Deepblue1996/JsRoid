package com.prohua.jsroid;

import android.webkit.JavascriptInterface;

import com.prohua.jsroid.event.WebViewCallEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * 交互对象映射
 * Created by Deep on 2018/2/7 0007.
 */

public class AndroidToJs {

    // 定义JS需要调用的方法，EventBus呼叫Activity
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    public void hello(String msg) {
        EventBus.getDefault().post(new WebViewCallEvent(msg));
    }
}