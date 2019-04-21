package com.movie.dao.mapping.ext;

import com.movie.dao.pojo.TbUser;
import com.movie.dao.pojo.ext.TbUserExt;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbUserMapperExt extends Mapper<TbUserExt> {
    TbUser selectUserByLogin(@Param("username")String username, @Param("password")String password);

    TbUser selectSalt(@Param("username") String username);

    Integer updateUserById(@Param("tbUser") TbUser tbUser);

    int updateUserImage(@Param("image") String image, @Param("userId") Integer userId);

    int addUser(@Param("tbUser") TbUser tbUser);

    int selectUserByPhone(@Param("phone") String phone);

    List<TbUserExt> selectMyOrder(@Param("id") Integer id);

    TbUser selectUserById(@Param("id") Integer id);
}