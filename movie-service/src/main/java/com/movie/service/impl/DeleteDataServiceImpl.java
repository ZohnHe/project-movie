package com.movie.service.impl;

import com.movie.dao.mapping.CinemaMapper;
import com.movie.dao.mapping.MovieMapper;
import com.movie.dao.mapping.SceneMapper;
import com.movie.service.DeleteDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeleteDataServiceImpl implements DeleteDataService {

    @Resource
    CinemaMapper cinemaMapper;

    @Resource
    MovieMapper movieMapper;

    @Resource
    SceneMapper sceneMapper;

    @Override
    public int deleteOne(Integer id,String name) {
        switch (name){
            case "影院":
                return cinemaMapper.deleteOneData(id);
            case "电影":
                return movieMapper.deleteOneData(id);
            case "场次":
                return sceneMapper.deleteOneData(id);
        }
        return -1;
    }
}



