package com.lpxiang.exception;

/**
 * Created by Tracy on 2016/3/15.
 */
public class DataFormatException extends Exception {

    public DataFormatException() {
        super("[数据格式错误]");
    }

    public DataFormatException(String message) {
        super("[数据格式错误]: " + message);
    }

}
