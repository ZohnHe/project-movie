package com.movie.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_time")
public class TbTime {
    @Id
    private Integer id;

    /**
     * 所属电影院
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 放映时间
     */
    @Column(name = "viewing_projection_start")
    private Date viewingProjectionStart;

    @Column(name = "viewing_projection_end")
    private Date viewingProjectionEnd;

    /**
     * 语言版本
     */
    @Column(name = "viewing_language")
    private String viewingLanguage;

    /**
     * 放映厅
     */
    @Column(name = "viewing_hall")
    private String viewingHall;

    /**
     * 售价（元）
     */
    @Column(name = "viewing_price")
    private Integer viewingPrice;

    /**
     * 时长
     */
    @Column(name = "viewing_time")
    private Integer viewingTime;
    /**
     * 时长
     */
    @Column(name = "movie_id")
    private Integer movieId;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getViewingTime() {
        return viewingTime;
    }

    public void setViewingTime(Integer viewingTime) {
        this.viewingTime = viewingTime;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取所属电影院
     *
     * @return parent_id - 所属电影院
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置所属电影院
     *
     * @param parentId 所属电影院
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取放映时间
     *
     * @return viewing_projection_start - 放映时间
     */
    public Date getViewingProjectionStart() {
        return viewingProjectionStart;
    }

    /**
     * 设置放映时间
     *
     * @param viewingProjectionStart 放映时间
     */
    public void setViewingProjectionStart(Date viewingProjectionStart) {
        this.viewingProjectionStart = viewingProjectionStart;
    }

    /**
     * @return viewing_projection_end
     */
    public Date getViewingProjectionEnd() {
        return viewingProjectionEnd;
    }

    /**
     * @param viewingProjectionEnd
     */
    public void setViewingProjectionEnd(Date viewingProjectionEnd) {
        this.viewingProjectionEnd = viewingProjectionEnd;
    }

    /**
     * 获取语言版本
     *
     * @return viewing_language - 语言版本
     */
    public String getViewingLanguage() {
        return viewingLanguage;
    }

    /**
     * 设置语言版本
     *
     * @param viewingLanguage 语言版本
     */
    public void setViewingLanguage(String viewingLanguage) {
        this.viewingLanguage = viewingLanguage == null ? null : viewingLanguage.trim();
    }

    /**
     * 获取放映厅
     *
     * @return viewing_hall - 放映厅
     */
    public String getViewingHall() {
        return viewingHall;
    }

    /**
     * 设置放映厅
     *
     * @param viewingHall 放映厅
     */
    public void setViewingHall(String viewingHall) {
        this.viewingHall = viewingHall == null ? null : viewingHall.trim();
    }

    /**
     * 获取售价（元）
     *
     * @return viewing_price - 售价（元）
     */
    public Integer getViewingPrice() {
        return viewingPrice;
    }

    /**
     * 设置售价（元）
     *
     * @param viewingPrice 售价（元）
     */
    public void setViewingPrice(Integer viewingPrice) {
        this.viewingPrice = viewingPrice;
    }
}