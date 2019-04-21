package com.movie.service;

import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.SceneShow;

public interface InsertDataService {
    int insertOne(Cinema cinema);
    int insertOne(Movie movie);
    int insertOne(SceneShow sceneShow);
}
