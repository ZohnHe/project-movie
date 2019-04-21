package com.movie.domain.resp;

import java.util.List;

public class UserOrderResp<T> {

    private Integer success;

    private List<T> list;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
