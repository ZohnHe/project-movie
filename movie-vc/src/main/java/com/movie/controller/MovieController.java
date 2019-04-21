package com.movie.controller;

import com.movie.dao.pojo.TbIntro;
import com.movie.dao.pojo.TbMovie;
import com.movie.domain.req.PageListReq;
import com.movie.entity.resp.MovieListResp;
import com.movie.entity.resp.MovieOneResp;
import com.movie.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {

    @Resource
    MovieService movieService;

    @RequestMapping(value = "/list" ,method = RequestMethod.POST)
    @ResponseBody
    public MovieListResp<TbMovie> getMovieList(){
        MovieListResp<TbMovie> resp = new MovieListResp<TbMovie>();
        resp.setCode("200");
        resp.setMessage("查询成功!!!");
        resp.setData(movieService.getMovieList(1,10).getList());

        return resp;
    }

    @RequestMapping(value = "/details" ,method = RequestMethod.GET)
    public String details(HttpServletRequest request , String movieId){
        request.getSession().setAttribute("movieId",movieId);
        return "details";
    }



    @RequestMapping(value = "/one" ,method = RequestMethod.POST)
    @ResponseBody
    public MovieOneResp getMovieOne(HttpServletRequest request){
        MovieOneResp movieOneResp = new MovieOneResp();
        int movieId = Integer.parseInt((String) request.getSession().getAttribute("movieId"));
        movieOneResp.setTbIntro(movieService.getIntroOne(movieId));
        movieOneResp.setTbMovie(movieService.getMovieOne(movieId));
        return movieOneResp;
    }

    @RequestMapping(value = "/pageList" ,method = RequestMethod.POST)
    @ResponseBody
    public MovieListResp<TbMovie> pageList(@RequestBody PageListReq pageListReq){
        MovieListResp<TbMovie> resp = new MovieListResp<TbMovie>();

        resp.setCode("200");
        resp.setMessage("查询成功!!!");

        Map<String, Object> map = movieService.selectAllPage(pageListReq.getPageNum(), pageListReq.getPageSize());

        resp.setPageCount(map.get("total"));

        //(totalCount + pageSize - 1) / pageSize

        resp.setData((List<TbMovie>) map.get("data"));

        return resp;
    }


}
