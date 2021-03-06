package com.auy.result;


import lombok.ToString;

@ToString
public enum CommCode implements ResultCode {

    SUCCESS(true,10000,"操作成功！"),
    FAIL(false,44444,"操作失败！"),
    INVALID_PARAM(false,10009,"非法参数！");


    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    CommCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
