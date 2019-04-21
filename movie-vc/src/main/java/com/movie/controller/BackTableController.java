package com.movie.controller;

import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.SceneShow;
import com.movie.domain.BackDataReq;
import com.movie.entity.req.MovieListResp;
import com.movie.service.impl.BackFormServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;



@Controller
@Api(tags = "表格")
@RequestMapping(value = "/api/admin")
public class BackTableController {

    @Resource
    BackFormServiceImpl backFormService;

    @ResponseBody
    @RequestMapping(value = "/back/cinema",method = RequestMethod.POST)
    @ApiOperation(value = "后台返回影院列表")
    public MovieListResp<Cinema> backCinemaForm(@RequestBody BackDataReq backDataReq){
        MovieListResp<Cinema> movieListResp = new MovieListResp<>();
        Map<String,Object> map = backFormService.getBackCinemaForm(backDataReq.getWhichPage(),backDataReq.getPageSize());

        movieListResp.setPageCount(map.get("total"));
        movieListResp.setData((List<Cinema>) map.get("data"));

        return movieListResp;
    }

    @ResponseBody
    @RequestMapping(value = "/back/movie",method = RequestMethod.POST)
    @ApiOperation(value = "后台返回电影列表")
    public MovieListResp<Movie> backMavieForm(@RequestBody BackDataReq backDataReq){
        MovieListResp<Movie> movieListResp = new MovieListResp<>();
        Map<String,Object> map = backFormService.getBackMovieForm(backDataReq.getWhichPage(),backDataReq.getPageSize());
        movieListResp.setPageCount(map.get("total"));
        movieListResp.setData((List<Movie>) map.get("data"));

        return movieListResp;
    }

    @ResponseBody
    @RequestMapping(value = "/back/scene",method = RequestMethod.POST)
    @ApiOperation(value = "后台返回电影列表")
    public MovieListResp<SceneShow> backSceneForm(@RequestBody BackDataReq backDataReq){
        Map<String, Object> map = backFormService.getBackSceneForm(backDataReq.getWhichPage(), backDataReq.getPageSize());
        MovieListResp<SceneShow> movieListResp = new MovieListResp<>();
        movieListResp.setPageCount(map.get("total"));
        movieListResp.setData((List<SceneShow>) map.get("data"));
        return movieListResp;
    }
}
