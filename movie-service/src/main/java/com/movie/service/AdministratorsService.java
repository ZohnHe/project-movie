package com.movie.service;

import com.movie.domain.BackLoginReq;

public interface AdministratorsService {

    /**
     * 判断管理员登录
     * @param backLoginReq
     * @return
     */
    public String judgementLogin(BackLoginReq backLoginReq);
}
