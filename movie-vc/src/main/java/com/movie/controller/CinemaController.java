package com.movie.controller;


import com.movie.dao.pojo.TbCinema;
import com.movie.dao.pojo.TbTime;
import com.movie.entity.resp.CinemaResp;
import com.movie.service.CinemaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Api
@RequestMapping(value = "/cinemas")
public class CinemaController {

    @Autowired
    CinemaService cinemaService;

    private int movieId;

    /**
     * 返回影院页面
     * @return
     */
    @RequestMapping(value = "/show" ,method = RequestMethod.GET)
    public String cinemas(HttpServletRequest request){
        int movieId = Integer.parseInt((String) request.getSession().getAttribute("movieId"));
        this.movieId = movieId;
        return "film_cinema";
    }

    /**
     * 根据电影id返回影院列表
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<TbCinema> selectAll(){

        return cinemaService.selectAllCinema(movieId);
    }

    /**
     * 获取影院id存进session
     * @param request
     * @param id
     * @return
     */
    @RequestMapping(value = "/session",method = RequestMethod.GET)
    public String session(HttpServletRequest request, String id){
        request.getSession().setAttribute("cinemaId",id);
        return "tickets";
    }


    /**
     * 根据电影id,影院id,返回电影和影院数据
     * @param request
     * @return
     */
    @RequestMapping(value = "/one",method = RequestMethod.GET)
    @ResponseBody
    public CinemaResp selectOne(HttpServletRequest request){
        CinemaResp cinemaResp = new CinemaResp();
        int id = Integer.parseInt((String) request.getSession().getAttribute("cinemaId"));
        cinemaResp.setTbCinema(cinemaService.selectOne(id));
        cinemaResp.setTbDetails(cinemaService.selectMovieById(movieId));

        return cinemaResp;
    }

    /**
     * 根据电影id显示场次
     * @param request
     * @return
     */
    @RequestMapping(value = "/TbTimeAll",method = RequestMethod.GET)
    @ResponseBody
    public List<TbTime> selectAll(HttpServletRequest request){
        int cinemaId = Integer.parseInt((String) request.getSession().getAttribute("cinemaId"));
        return cinemaService.selectById(movieId,cinemaId);
    }

}
