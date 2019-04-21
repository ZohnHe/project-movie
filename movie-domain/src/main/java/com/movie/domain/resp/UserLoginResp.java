package com.movie.domain.resp;

import io.swagger.annotations.ApiModelProperty;

public class UserLoginResp {

    /**
     * 响应返回值
     */
    private Integer success;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * sessionId
     */
    private String sessionId;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
