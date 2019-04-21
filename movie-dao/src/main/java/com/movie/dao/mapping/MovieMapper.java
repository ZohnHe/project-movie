package com.movie.dao.mapping;

import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MovieMapper extends Mapper<Movie> {
    /**
     * 根据id删除一条数据
     * @param id
     * @return
     */
    int deleteOneData(@Param("id") Integer id);

    int insertOneData(@Param("movie") Movie movie);
}