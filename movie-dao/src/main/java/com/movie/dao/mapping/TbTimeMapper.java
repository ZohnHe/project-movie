package com.movie.dao.mapping;

import com.movie.dao.pojo.TbTime;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbTimeMapper extends Mapper<TbTime> {
    List<TbTime> selectAllById(int id);
    List<TbTime> selectById(@Param("movie_id") int movieId , @Param("parent_id") int parentId);
}