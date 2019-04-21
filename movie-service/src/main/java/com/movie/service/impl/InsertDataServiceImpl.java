package com.movie.service.impl;

import com.movie.dao.mapping.CinemaMapper;
import com.movie.dao.mapping.MovieMapper;
import com.movie.dao.mapping.SceneMapper;
import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.SceneShow;
import com.movie.service.InsertDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InsertDataServiceImpl implements InsertDataService {

    @Resource
    CinemaMapper cinemaMapper;

    @Resource
    MovieMapper movieMapper;

    @Resource
    SceneMapper sceneMapper;


    @Override
    public int insertOne(Cinema cinema) {
        return cinemaMapper.insertOneData(cinema);
    }

    @Override
    public int insertOne(Movie movie) {
        return movieMapper.insertOneData(movie);
    }

    @Override
    public int insertOne(SceneShow sceneShow) {
        return sceneMapper.insertOneData(sceneShow);
    }
}
