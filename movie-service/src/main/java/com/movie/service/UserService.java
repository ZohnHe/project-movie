package com.movie.service;

import com.movie.dao.pojo.TbUser;
import com.movie.dao.pojo.ext.TbUserExt;
import com.movie.domain.req.SaveUserImageReq;
import com.movie.domain.req.UserLoginReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    TbUser userLogin(UserLoginReq userLoginReq);

    String getSalt(String username);

    Integer modifyUserById(TbUser tbUser);

    int saveUserImage(SaveUserImageReq saveUserImageReq);

    int userRegister(TbUser tbUser);

    int getPhone(String phone);

    List<TbUserExt> getMyOrder(Integer id);

    TbUser getUserById(Integer id);
}
