package com.movie.dao.pojo;

import java.util.Date;

public class OrderResp {
    /**
     * 订单信息回显
     */
    private String movieName;
    private Date time;
    private String cinemaName;
    private String viewingHall;
    private String seat1;
    private String seat2;
    private Integer payCount;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getViewingHall() {
        return viewingHall;
    }

    public void setViewingHall(String viewingHall) {
        this.viewingHall = viewingHall;
    }

    public String getSeat1() {
        return seat1;
    }

    public void setSeat1(String seat1) {
        this.seat1 = seat1;
    }

    public String getSeat2() {
        return seat2;
    }

    public void setSeat2(String seat2) {
        this.seat2 = seat2;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }
}
