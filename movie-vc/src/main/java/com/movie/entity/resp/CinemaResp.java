package com.movie.entity.resp;

import com.movie.dao.pojo.TbCinema;
import com.movie.dao.pojo.TbDetails;

public class CinemaResp {
    private TbCinema tbCinema;
    private TbDetails tbDetails;

    public CinemaResp() {
    }

    public CinemaResp(TbCinema tbCinema, TbDetails tbDetails) {
        this.tbCinema = tbCinema;
        this.tbDetails = tbDetails;
    }

    public TbCinema getTbCinema() {
        return tbCinema;
    }

    public void setTbCinema(TbCinema tbCinema) {
        this.tbCinema = tbCinema;
    }

    public TbDetails getTbDetails() {
        return tbDetails;
    }

    public void setTbDetails(TbDetails tbDetails) {
        this.tbDetails = tbDetails;
    }
}
