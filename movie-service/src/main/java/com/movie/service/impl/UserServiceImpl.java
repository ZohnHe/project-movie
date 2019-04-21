package com.movie.service.impl;

import com.movie.dao.mapping.ext.TbUserMapperExt;
import com.movie.dao.pojo.TbUser;
import com.movie.dao.pojo.ext.TbUserExt;
import com.movie.domain.req.SaveUserImageReq;
import com.movie.domain.req.UserLoginReq;
import com.movie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    TbUserMapperExt tbUserMapperExt;

    @Override
    public TbUser userLogin(UserLoginReq userLoginReq) {
        return tbUserMapperExt.selectUserByLogin(userLoginReq.getUsername(), userLoginReq.getPassword());
    }

    @Override
    public String getSalt(String username) {
        if (tbUserMapperExt.selectSalt(username) != null){
            return tbUserMapperExt.selectSalt(username).getSalt();
        }else {
            return null;
        }
    }

    @Override
    public Integer modifyUserById(TbUser tbUser) {
        return tbUserMapperExt.updateUserById(tbUser);
    }

    @Override
    public int saveUserImage(SaveUserImageReq saveUserImageReq) {
        return tbUserMapperExt.updateUserImage(saveUserImageReq.getImage(),saveUserImageReq.getUserId());
    }

    @Override
    public int userRegister(TbUser tbUser) {
        return tbUserMapperExt.addUser(tbUser);
    }

    @Override
    public int getPhone(String phone) {
        return tbUserMapperExt.selectUserByPhone(phone);
    }

    @Override
    public List<TbUserExt> getMyOrder(Integer id) {
        List<TbUserExt> list = tbUserMapperExt.selectMyOrder(id);
        if (list != null && !list.isEmpty()) {
            for (int i = list.size() - 1 ; i  >= 0 ; i --){
                if (!id.equals(list.get(i).getId())){
                    list.remove(i);
                }
            }
        }
        return list;
    }

    @Override
    public TbUser getUserById(Integer id) {
        return tbUserMapperExt.selectUserById(id);
    }
}
