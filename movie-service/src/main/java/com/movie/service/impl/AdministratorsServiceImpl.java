package com.movie.service.impl;

import com.movie.dao.mapping.BackAdminMapper;
import com.movie.dao.pojo.BackAdmin;
import com.movie.domain.BackLoginReq;
import com.movie.service.AdministratorsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdministratorsServiceImpl implements AdministratorsService {

    @Resource
    BackAdminMapper backAdminMapper;

    @Override
    public String judgementLogin(BackLoginReq backLoginReq) {
        Example example = new Example(BackAdmin.class);
        example.createCriteria().andEqualTo("username", backLoginReq.getUsername())
                .andEqualTo("password", backLoginReq.getPassword());
        List<BackAdmin> backAdminList = backAdminMapper.selectByExample(example);

        if (backAdminList != null && backAdminList.size() > 0){
            return "1";
        }
        return null;
    }
}