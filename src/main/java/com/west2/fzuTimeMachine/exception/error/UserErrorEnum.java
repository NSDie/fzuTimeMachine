package com.west2.fzuTimeMachine.exception.error;


/**
 * @description: 用户错误枚举
 * @author: hlx 2018-10-02
 **/
public enum UserErrorEnum implements ApiError {

    // code非法
    CODE_INVALID(130,"CODE_INVALID"),

    // 尚未注册
    OAUTH_NOT_FOUND(131,"OAUTH_NOT_FOUND"),

    // 用户已经存在
    EXIST(132, "EXIST"),

    // 账号密码错误
    PASS_INVALID(133, "PASS_INVALID");

    // 响应码
    private final int code;

    // 提示信息
    private final String message;

    UserErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMsg() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

}
