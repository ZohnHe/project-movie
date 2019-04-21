package com.movie.dao.pojo;

public class ChooseSeat {
    /**
     * 进入选座页面前需要的信息
     */
    private String cinemaName;
    private String movieName;
    private String viewingTime;
    private String startTime;
    private String movieFeel;
    private int price;

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getViewingTime() {
        return viewingTime;
    }

    public void setViewingTime(String viewingTime) {
        this.viewingTime = viewingTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMovieFeel() {
        return movieFeel;
    }

    public void setMovieFeel(String movieFeel) {
        this.movieFeel = movieFeel;
    }
}
