package com.movie.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_order")
public class TbOrder implements java.io.Serializable {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 影视id
     */
    @Column(name = "movie_id")
    private Integer movieId;

    /**
     * 影视场次
     */
    @Column(name = "moviv_scene")
    private Integer movivScene;

    /**
     * 影院id
     */
    @Column(name = "cinema_id")
    private Integer cinemaId;

    /**
     * 选座1
     */
    private String seat1;

    /**
     * 选座2
     */
    private String seat2;

    /**
     * 选座3
     */
    private String seat3;

    /**
     * 选座4
     */
    private String seat4;

    /**
     * 取票码
     */
    private String ticketNumber;

    /**
     * 选座6
     */
    private String isActive;

    /**
     * 是否支付(0-未支付 1-已支付)
     */
    @Column(name = "is_pay")
    private Integer isPay;

    /**
     * 支付方式(0-支付宝 1-微信)
     */
    @Column(name = "pay_count")
    private Integer payCount;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return creat_time - 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatTime 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取影视id
     *
     * @return movie_id - 影视id
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     * 设置影视id
     *
     * @param movieId 影视id
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    /**
     * 获取影视场次
     *
     * @return moviv_scene - 影视场次
     */
    public Integer getMovivScene() {
        return movivScene;
    }

    /**
     * 设置影视场次
     *
     * @param movivScene 影视场次
     */
    public void setMovivScene(Integer movivScene) {
        this.movivScene = movivScene;
    }

    /**
     * 获取影院id
     *
     * @return cinema_id - 影院id
     */
    public Integer getCinemaId() {
        return cinemaId;
    }

    /**
     * 设置影院id
     *
     * @param cinemaId 影院id
     */
    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    /**
     * 获取选座1
     *
     * @return seat1 - 选座1
     */
    public String getSeat1() {
        return seat1;
    }

    /**
     * 设置选座1
     *
     * @param seat1 选座1
     */
    public void setSeat1(String seat1) {
        this.seat1 = seat1 == null ? null : seat1.trim();
    }

    /**
     * 获取选座2
     *
     * @return seat2 - 选座2
     */
    public String getSeat2() {
        return seat2;
    }

    /**
     * 设置选座2
     *
     * @param seat2 选座2
     */
    public void setSeat2(String seat2) {
        this.seat2 = seat2 == null ? null : seat2.trim();
    }

    /**
     * 获取选座3
     *
     * @return seat3 - 选座3
     */
    public String getSeat3() {
        return seat3;
    }

    /**
     * 设置选座3
     *
     * @param seat3 选座3
     */
    public void setSeat3(String seat3) {
        this.seat3 = seat3 == null ? null : seat3.trim();
    }

    /**
     * 获取选座4
     *
     * @return seat4 - 选座4
     */
    public String getSeat4() {
        return seat4;
    }

    /**
     * 设置选座4
     *
     * @param seat4 选座4
     */
    public void setSeat4(String seat4) {
        this.seat4 = seat4 == null ? null : seat4.trim();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    /**
     * 获取是否支付(0-未支付 1-已支付)
     *
     * @return is_pay - 是否支付(0-未支付 1-已支付)
     */
    public Integer getIsPay() {
        return isPay;
    }

    /**
     * 设置是否支付(0-未支付 1-已支付)
     *
     * @param isPay 是否支付(0-未支付 1-已支付)
     */
    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }
}