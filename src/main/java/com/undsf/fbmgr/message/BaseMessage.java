package com.undsf.fbmgr.message;

/**
 * Created by Arathi on 2018/5/9.
 */
public class BaseMessage {
    public int code;
    public String message;

    public BaseMessage() {
        code = 0;
        message = "成功";
    }

    public BaseMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
