package com.movie.service.impl;

import com.movie.dao.mapping.TbCinemaMapper;
import com.movie.dao.mapping.TbDetailsMapper;
import com.movie.dao.mapping.TbTimeMapper;
import com.movie.dao.pojo.TbCinema;
import com.movie.dao.pojo.TbDetails;
import com.movie.dao.pojo.TbTime;
import com.movie.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Resource
    TbCinemaMapper tbCinemaMapper;

    @Resource
    TbTimeMapper tbTimeMapper;

    @Resource
    TbDetailsMapper tbDetailsMapper;

    @Override
    public List<TbCinema> selectAll() {
        return tbCinemaMapper.selectAll();
    }

    @Override
    public TbCinema selectOne(int id) {
        TbCinema tbCinema = new TbCinema();
        tbCinema.setId(id);
        return tbCinemaMapper.selectOne(tbCinema);
    }

    @Override
    public List<TbTime> selectTbTime() {
        return tbTimeMapper.selectAll();
    }

    @Override
    public List<TbTime> selectAllById(int id) {
        return tbTimeMapper.selectAllById(id);
    }

    @Override
    public TbDetails selectMovieById(int id) {
        TbDetails tbDetails = new TbDetails();
        tbDetails.setId(id);
        return tbDetailsMapper.selectByPrimaryKey(tbDetails);
    }

    @Override
    public List<TbTime> selectById(int movieId, int parentId) {

        return tbTimeMapper.selectById(movieId, parentId);
    }

    @Override
    public List<TbCinema> selectAllCinema(int movieId) {
        return tbCinemaMapper.selectAllCinema(movieId);
    }


}
