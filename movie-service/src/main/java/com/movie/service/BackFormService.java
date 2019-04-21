package com.movie.service;

import com.github.pagehelper.PageInfo;
import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.Scene;
import com.movie.dao.pojo.SceneShow;

import java.util.List;
import java.util.Map;

public interface BackFormService {
   /*List<Cinema> getBackCinemaForm();
   List<Movie> getBackMoveForm();
   List<SceneShow> getBackSceneForm();*/

/*    public PageInfo<Cinema> page(Map<String, Object> params);*/
    public Map<String,Object> getBackCinemaForm(int whichPage,int pageSize);
    public Map<String,Object> getBackMovieForm(int whichPage,int pageSize);
    public Map<String,Object> getBackSceneForm(int whichPage,int pageSize);
}
