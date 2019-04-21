package com.movie.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.dao.mapping.TbIntroMapper;
import com.movie.dao.mapping.TbMovieMapper;
import com.movie.dao.pojo.TbIntro;
import com.movie.dao.pojo.TbMovie;
import com.movie.dao.pojo.TbUser;
import com.movie.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    TbMovieMapper tbMovieMapper;

    @Resource
    TbIntroMapper tbIntroMapper;

    @Override
    public PageInfo<TbMovie> getMovieList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<TbMovie> list = tbMovieMapper.selectAll();

        return new PageInfo<TbMovie>(list);
    }

    @Override
    public TbMovie getMovieOne(int movieId) {
        TbMovie tbMovie = new TbMovie();
        tbMovie.setId(movieId);
        return tbMovieMapper.selectByPrimaryKey(tbMovie);
    }

    @Override
    public TbIntro getIntroOne(int movieId) {
        TbIntro tbIntro = new TbIntro();
        tbIntro.setMovieId(movieId);
        return tbIntroMapper.selectByPrimaryKey(tbIntro);
    }

    public Map<String, Object> selectAllPage(int pageNum,int pageSize) {
        Map<String, Object> data = new HashMap<String, Object>();
        Page page = PageHelper.startPage(pageNum, pageSize);

        List<TbMovie> query = tbMovieMapper.selectAll();

        data.put("data",query);
        data.put("total",page.getTotal());

        return data;
    }


}
