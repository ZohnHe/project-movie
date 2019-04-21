package com.movie.dao.pojo;

import javax.persistence.*;

@Table(name = "m_details")
public class TbMovie {
    @Id
    private Integer id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_Englist_name")
    private String movieEnglistName;

    @Column(name = "movie_classify1")
    private String movieClassify1;

    @Column(name = "movie_classify2")
    private String movieClassify2;

    @Column(name = "movie_classify3")
    private String movieClassify3;

    @Column(name = "movie_feel")
    private String movieFeel;

    @Column(name = "movie_length")
    private String movieLength;

    @Column(name = "movie_date")
    private String movieDate;

    @Column(name = "movie_score")
    private String movieScore;

    @Column(name = "movie_intro")
    private String movieIntro;

    @Column(name = "movie_photo")
    private String moviePhoto;

    private Integer flag;

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
     * @return movie_name
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    /**
     * @return movie_Englist_name
     */
    public String getMovieEnglistName() {
        return movieEnglistName;
    }

    /**
     * @param movieEnglistName
     */
    public void setMovieEnglistName(String movieEnglistName) {
        this.movieEnglistName = movieEnglistName == null ? null : movieEnglistName.trim();
    }

    /**
     * @return movie_classify1
     */
    public String getMovieClassify1() {
        return movieClassify1;
    }

    /**
     * @param movieClassify1
     */
    public void setMovieClassify1(String movieClassify1) {
        this.movieClassify1 = movieClassify1 == null ? null : movieClassify1.trim();
    }

    /**
     * @return movie_classify2
     */
    public String getMovieClassify2() {
        return movieClassify2;
    }

    /**
     * @param movieClassify2
     */
    public void setMovieClassify2(String movieClassify2) {
        this.movieClassify2 = movieClassify2 == null ? null : movieClassify2.trim();
    }

    /**
     * @return movie_classify3
     */
    public String getMovieClassify3() {
        return movieClassify3;
    }

    /**
     * @param movieClassify3
     */
    public void setMovieClassify3(String movieClassify3) {
        this.movieClassify3 = movieClassify3 == null ? null : movieClassify3.trim();
    }

    /**
     * @return movie_feel
     */
    public String getMovieFeel() {
        return movieFeel;
    }

    /**
     * @param movieFeel
     */
    public void setMovieFeel(String movieFeel) {
        this.movieFeel = movieFeel == null ? null : movieFeel.trim();
    }

    /**
     * @return movie_length
     */
    public String getMovieLength() {
        return movieLength;
    }

    /**
     * @param movieLength
     */
    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength == null ? null : movieLength.trim();
    }

    /**
     * @return movie_date
     */
    public String getMovieDate() {
        return movieDate;
    }

    /**
     * @param movieDate
     */
    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate == null ? null : movieDate.trim();
    }

    /**
     * @return movie_score
     */
    public String getMovieScore() {
        return movieScore;
    }

    /**
     * @param movieScore
     */
    public void setMovieScore(String movieScore) {
        this.movieScore = movieScore == null ? null : movieScore.trim();
    }

    /**
     * @return movie_intro
     */
    public String getMovieIntro() {
        return movieIntro;
    }

    /**
     * @param movieIntro
     */
    public void setMovieIntro(String movieIntro) {
        this.movieIntro = movieIntro == null ? null : movieIntro.trim();
    }

    /**
     * @return movie_photo
     */
    public String getMoviePhoto() {
        return moviePhoto;
    }

    /**
     * @param moviePhoto
     */
    public void setMoviePhoto(String moviePhoto) {
        this.moviePhoto = moviePhoto == null ? null : moviePhoto.trim();
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