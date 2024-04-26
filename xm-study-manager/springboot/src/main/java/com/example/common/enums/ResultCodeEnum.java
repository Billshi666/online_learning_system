package com.example.common.enums;

public enum ResultCodeEnum {
    SUCCESS("200", "成功"),

    PARAM_ERROR("400", "参数异常"),
    TOKEN_INVALID_ERROR("401", "无效的token"),
    TOKEN_CHECK_ERROR("401", "token验证失败，请重新登录"),
    PARAM_LOST_ERROR("4001", "参数缺失"),

    SYSTEM_ERROR("500", "系统异常"),
    USER_EXIST_ERROR("5001", "用户名已存在"),
    USER_NOT_LOGIN("5002", "用户未登录"),
    USER_ACCOUNT_ERROR("5003", "账号或密码错误"),
    USER_NOT_EXIST_ERROR("5004", "用户不存在"),
    PARAM_PASSWORD_ERROR("5005", "原密码输入错误"),
    RECOMMEND_ALREADY_ERROR("5006", "已经有推荐了，请先下架原来的再推荐"),
    SIGNIN_ALREADY_ERROR("5007", "您今天已经签过到了，请明天再来吧！"),
    ACCOUNT_LOWER_ERROR("5008", "余额不足，请到个人中心充值"),
    SCORE_LOWER_ERROR("5009", "积分不足，请坚持每天签到或者上传资源获取"),
    ;

    public String code;
    public String msg;

    ResultCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
