package com.prohua.jsroid.event;

import java.io.Serializable;

/**
 * Created by Deep on 2018/2/7 0007.
 */

public class WebViewCallEvent implements Serializable {
    private String msg;

    public WebViewCallEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
