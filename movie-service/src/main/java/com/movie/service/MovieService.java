package com.movie.service;

import com.github.pagehelper.PageInfo;
import com.movie.dao.pojo.TbIntro;
import com.movie.dao.pojo.TbMovie;

import java.util.Map;

public interface MovieService {
    public PageInfo<TbMovie> getMovieList(int pageNum, int pageSize);

    TbMovie getMovieOne(int movieId);

    TbIntro getIntroOne(int movieId);

    public Map<String, Object> selectAllPage(int pageNum, int pageSize);

}
