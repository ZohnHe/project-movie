package com.movie.common;

import com.movie.common.constant.ResponseCode;

public class BaseResponse<T> {
    private String code = ResponseCode.OK.getCode();
    private String msg = ResponseCode.OK.getDesc();
    private T data;

    public BaseResponse(){
    }
    public BaseResponse(T data){
        this.data=data;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
