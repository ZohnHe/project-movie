package com.movie.dao.pojo;

import javax.persistence.*;

@Table(name = "m_cinema")
public class TbCinema {
    /**
     * 电影院id
     */
    @Id
    private Integer id;

    /**
     * 电影院名字
     */
    @Column(name = "cinema_name")
    private String cinemaName;

    /**
     * 电影院地址
     */
    @Column(name = "cinema_address")
    private String cinemaAddress;

    /**
     * 电影院练习号码
     */
    @Column(name = "cinema_phone")
    private String cinemaPhone;

    /**
     * 3D眼镜收费
     */
    @Column(name = "cinema_glasses")
    private String cinemaGlasses;

    /**
     * 儿童优惠
     */
    @Column(name = "cinema_preferences")
    private String cinemaPreferences;

    /**
     * 可停车
     */
    @Column(name = "cinema_parking")
    private String cinemaParking;

    /**
     * 价格
     */
    @Column(name = "cinema_price")
    private Integer cinemaPrice;

    @Column(name = "cinema_img")
    private String cinemaImg;

    private Integer flag;

    /**
     * 获取电影院id
     *
     * @return id - 电影院id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置电影院id
     *
     * @param id 电影院id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取电影院名字
     *
     * @return cinema_name - 电影院名字
     */
    public String getCinemaName() {
        return cinemaName;
    }

    /**
     * 设置电影院名字
     *
     * @param cinemaName 电影院名字
     */
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName == null ? null : cinemaName.trim();
    }

    /**
     * 获取电影院地址
     *
     * @return cinema_address - 电影院地址
     */
    public String getCinemaAddress() {
        return cinemaAddress;
    }

    /**
     * 设置电影院地址
     *
     * @param cinemaAddress 电影院地址
     */
    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress == null ? null : cinemaAddress.trim();
    }

    /**
     * 获取电影院练习号码
     *
     * @return cinema_phone - 电影院练习号码
     */
    public String getCinemaPhone() {
        return cinemaPhone;
    }

    /**
     * 设置电影院练习号码
     *
     * @param cinemaPhone 电影院练习号码
     */
    public void setCinemaPhone(String cinemaPhone) {
        this.cinemaPhone = cinemaPhone == null ? null : cinemaPhone.trim();
    }

    /**
     * 获取3D眼镜收费
     *
     * @return cinema_glasses - 3D眼镜收费
     */
    public String getCinemaGlasses() {
        return cinemaGlasses;
    }

    /**
     * 设置3D眼镜收费
     *
     * @param cinemaGlasses 3D眼镜收费
     */
    public void setCinemaGlasses(String cinemaGlasses) {
        this.cinemaGlasses = cinemaGlasses == null ? null : cinemaGlasses.trim();
    }

    /**
     * 获取儿童优惠
     *
     * @return cinema_preferences - 儿童优惠
     */
    public String getCinemaPreferences() {
        return cinemaPreferences;
    }

    /**
     * 设置儿童优惠
     *
     * @param cinemaPreferences 儿童优惠
     */
    public void setCinemaPreferences(String cinemaPreferences) {
        this.cinemaPreferences = cinemaPreferences == null ? null : cinemaPreferences.trim();
    }

    /**
     * 获取可停车
     *
     * @return cinema_parking - 可停车
     */
    public String getCinemaParking() {
        return cinemaParking;
    }

    /**
     * 设置可停车
     *
     * @param cinemaParking 可停车
     */
    public void setCinemaParking(String cinemaParking) {
        this.cinemaParking = cinemaParking == null ? null : cinemaParking.trim();
    }

    /**
     * 获取价格
     *
     * @return cinema_price - 价格
     */
    public Integer getCinemaPrice() {
        return cinemaPrice;
    }

    /**
     * 设置价格
     *
     * @param cinemaPrice 价格
     */
    public void setCinemaPrice(Integer cinemaPrice) {
        this.cinemaPrice = cinemaPrice;
    }

    /**
     * @return cinema_img
     */
    public String getCinemaImg() {
        return cinemaImg;
    }

    /**
     * @param cinemaImg
     */
    public void setCinemaImg(String cinemaImg) {
        this.cinemaImg = cinemaImg == null ? null : cinemaImg.trim();
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}