package com.movie.controller;

import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Movie;
import com.movie.dao.pojo.SceneShow;
import com.movie.domain.BackDataReq;
import com.movie.domain.BackIdReq;
import com.movie.service.InsertDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@Api(tags = "添加数据")
@RequestMapping(value = "/api/admin")
public class AddDataController {

    @Resource
    InsertDataService insertDataService;

    @RequestMapping(value = "/back/add/cinema" ,method = RequestMethod.POST)
    @ApiOperation(value = "后台返回影院列表")
    @ResponseBody
    public String addDataCinema(@RequestBody Cinema cinema) {
        //调用Service
        String s = String.valueOf(insertDataService.insertOne(cinema));
        return s;
    }

    @RequestMapping(value = "/back/add/movie" ,method = RequestMethod.POST)
    @ApiOperation(value = "后台返回电影列表")
    @ResponseBody
    public String addDataMovie(@RequestBody Movie movie) {
        //调用Service
        String s = String.valueOf(insertDataService.insertOne(movie));
        return s;
    }
}


