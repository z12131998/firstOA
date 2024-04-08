package com.first.common.restful;

/**
 * @author 周俊宇
 * @version 1.0.0
 * @title RespondCode
 * @description 返回响应码
 * @date 2024/4/8 16:30
 */
public enum RespondCode {
    /**
     * 通用成功响应码
     */
    SUCCESS(200);
    private int code;

    RespondCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
