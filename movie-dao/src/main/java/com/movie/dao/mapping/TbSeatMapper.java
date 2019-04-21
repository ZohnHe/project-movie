package com.movie.dao.mapping;

import com.movie.dao.pojo.TbSeat;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbSeatMapper extends Mapper<TbSeat> {

    public List<TbSeat> selectBySceneId(@Param("movie_scene") int movie_scene );
}