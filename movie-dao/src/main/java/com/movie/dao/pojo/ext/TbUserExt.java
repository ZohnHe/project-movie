package com.movie.dao.pojo.ext;

import com.movie.dao.pojo.TbUser;

import javax.persistence.Column;

public class TbUserExt extends TbUser {

    /**
     * 下单时间
     */
    @Column(name = "creat_time")
    private String creatTime;

    /**
     * 下单号
     */
    @Column(name = "orderId")
    private Integer orderId;

    /**
     * 座位1
     */
    private String seat1;

    /**
     * 座位2
     */
    private String seat2;

    /**
     * 座位3
     */
    private String seat3;

    /**
     * 座位4
     */
    private String seat4;

    /**
     * 取票码
     */
    @Column(name = "ticket_number")
    private String ticketNumber;

    /**
     * 支付状态
     */
    @Column(name = "is_pay")
    private Integer isPay;

    /**
     * 实际支付金额
     */
    @Column(name = "pay_count")
    private Integer payCount;

    /**
     * 电影海报
     */
    @Column(name = "movie_photo")
    private String moviePhoto;

    /**
     * 电影名
     */
    @Column(name = "movie_name")
    private String movieName;

    /**
     * 电影上映时间
     */
    @Column(name = "movie_date")
    private String movieDate;

    /**
     * 电影院名称
     */
    @Column(name = "cinema_name")
    private String cinemaName;

    /**
     * 影厅
     */
    @Column(name = "viewing_hall")
    private String viewingHall;

    /**
     * 电影票价
     */
    @Column(name = "viewing_price")
    private String viewingPrice;

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getSeat3() {
        return seat3;
    }

    public void setSeat3(String seat3) {
        this.seat3 = seat3;
    }

    public String getSeat4() {
        return seat4;
    }

    public void setSeat4(String seat4) {
        this.seat4 = seat4;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public String getMoviePhoto() {
        return moviePhoto;
    }

    public void setMoviePhoto(String moviePhoto) {
        this.moviePhoto = moviePhoto;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
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

    public String getViewingPrice() {
        return viewingPrice;
    }

    public void setViewingPrice(String viewingPrice) {
        this.viewingPrice = viewingPrice;
    }
}