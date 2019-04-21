package com.movie.service;

import com.movie.dao.pojo.TbCinema;
import com.movie.dao.pojo.TbDetails;
import com.movie.dao.pojo.TbTime;

import java.util.List;

public interface CinemaService {
    /**
     * 查询所有影院
     * @return
     */
    List<TbCinema> selectAll();

    /**
     * 根据id查询影院
     * @param id
     * @return
     */
    TbCinema selectOne(int id);

    /**
     * 查询所有场次
     */
    List<TbTime> selectTbTime();

    List<TbTime> selectAllById(int id);

    /**
     * 根据id查询影院
     * @param id
     * @return
     */
    TbDetails selectMovieById(int id);

    List<TbTime> selectById(int movieId ,int parentId);

    List<TbCinema> selectAllCinema(int movieId);


}
