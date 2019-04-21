package com.movie.dao.mapping;

import com.movie.dao.pojo.TbCinema;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbCinemaMapper extends Mapper<TbCinema> {

    List<TbCinema> selectAllCinema(@Param("movie_id") int movieId);

}