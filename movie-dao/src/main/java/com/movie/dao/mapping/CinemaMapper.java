package com.movie.dao.mapping;

import com.movie.dao.pojo.Cinema;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface CinemaMapper extends Mapper<Cinema> {
    /**
     * 根据id删除一条数据
     * @param id
     * @return
     */
    int deleteOneData(@Param("id") Integer id);

    int insertOneData(@Param("cinema") Cinema cinema);
}