package com.undsf.fbmgr.message;

/**
 * Created by Arathi on 2018/5/9.
 */
public class DataMessage<T> extends BaseMessage {
    public T data;

    public DataMessage() {
        super();
        data = null;
    }

    public DataMessage(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }
}
