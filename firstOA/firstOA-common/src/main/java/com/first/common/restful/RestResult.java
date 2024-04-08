package com.first.common.restful;

/**
 * @author 周俊宇
 * @version 1.0.0
 * @title RestResult
 * @description 通用返回类
 * @date 2024/4/8 16:30
 */
public class RestResult {
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;
    private Object date;
    private Object other;

    public RestResult(RespondCode code) {
        this.code = code.getCode();
    }

    public static RestResult success() {
        return new RestResult(RespondCode.SUCCESS);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }
}
