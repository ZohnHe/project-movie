package com.movie.entity.resp;

import com.movie.dao.pojo.TbIntro;
import com.movie.dao.pojo.TbMovie;

public class MovieOneResp {
    private TbMovie tbMovie;

    private TbIntro tbIntro;

    public MovieOneResp(TbMovie tbMovie, TbIntro tbIntro) {
        this.tbMovie = tbMovie;
        this.tbIntro = tbIntro;
    }

    public MovieOneResp() {
    }

    public TbMovie getTbMovie() {
        return tbMovie;
    }

    public void setTbMovie(TbMovie tbMovie) {
        this.tbMovie = tbMovie;
    }

    public TbIntro getTbIntro() {
        return tbIntro;
    }

    public void setTbIntro(TbIntro tbIntro) {
        this.tbIntro = tbIntro;
    }
}
