package com.movie.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.movie.dao.mapping.CinemaMapper;
import com.movie.dao.mapping.MovieMapper;
import com.movie.dao.mapping.SceneMapper;
import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.Scene;
import com.movie.dao.pojo.SceneShow;
import com.movie.service.BackFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BackFormServiceImpl implements BackFormService {

    @Resource
    CinemaMapper cinemaMapper;

    @Resource
    MovieMapper movieMapper;

    @Resource
    SceneMapper sceneMapper;

    /**
     * 分页获取电影院数据
     * @return
     */
    @Override
    public Map<String,Object> getBackCinemaForm(int whichPage,int pageSize) {
        Map<String,Object> map = new HashMap<String, Object>();
        Page page = PageHelper.startPage(whichPage,pageSize);
        List<Cinema> cinemaList = cinemaMapper.selectAll();
        map.put("data",cinemaList);
        map.put("total",page.getTotal());
        return map;
    }

    @Override
    public Map<String, Object> getBackMovieForm(int whichPage, int pageSize) {
        Map<String,Object> map = new HashMap<String, Object>();
        Page page = PageHelper.startPage(whichPage,pageSize);
        List<Movie> movieList = movieMapper.selectAll();
        map.put("data",movieList);
        map.put("total",page.getTotal());

        System.out.println(page.getTotal());

        return map;
    }

    @Override
    public Map<String, Object> getBackSceneForm(int whichPage, int pageSize) {
        Map<String,Object> map = new HashMap<String, Object>();
        Page page = PageHelper.startPage(whichPage,pageSize);
        List<SceneShow> sceneShowList = sceneMapper.selectSceneShow();
        map.put("data",sceneShowList);
        map.put("total",page.getTotal());
        return map;
    }

/*    @Override
    public List<Cinema> getBackCinemaForm() {
        return cinemaMapper.selectAll();
    }*/

/*    *//**
     * 获取全部电影数据
     * @return
     *//*
    @Override
    public List<Movie> getBackMoveForm() {
        return movieMapper.selectAll();
    }

    *//**
     * 获取全部座次数据
     * @return
     *//*
    @Override
    public List<SceneShow> getBackSceneForm() {
        return sceneMapper.selectSceneShow();
    }*/








/*    @Override
    public PageInfo<Cinema> page(Map<String, Object> params) {
        PageInfo<Cinema> pageInfo = new PageInfo<>();

        int count = cinemaMapper.count();
        List<Cinema> cinemaList = cinemaMapper.page(params);

        pageInfo.setTotal(count);
        pageInfo.setRecordsFiltered(count);
        pageInfo.set(cinemaList);

        return pageInfo;
    }*/
}
