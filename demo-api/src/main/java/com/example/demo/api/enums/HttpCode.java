package com.example.demo.api.enums;

/**
 * @author superman
 */

public enum HttpCode {
    /**
     * 成功且有数据
     * **/
    SUCCESS(1,"成功"),
    /**
     * 成功无数据
     * **/
    FAIL(-1,"失败"),
    /**
     * 系统异常
     * **/
    EXCEPTION(500,"系统异常");

    private int code;
    private String msg;

    HttpCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
}
