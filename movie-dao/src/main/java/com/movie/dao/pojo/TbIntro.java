package com.movie.dao.pojo;

import javax.persistence.*;

@Table(name = "m_intro")
public class TbIntro {
    @Id
    @Column(name = "movie_id")
    private Integer movieId;

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

    @Column(name = "movie_posters")
    private String moviePosters;

    @Column(name = "movie_star")
    private String movieStar;

    @Column(name = "movie_photo")
    private String moviePhoto;

    @Column(name = "movie_intro")
    private String movieIntro;

    @Column(name = "movie_picture1")
    private String moviePicture1;

    @Column(name = "movie_picture2")
    private String moviePicture2;

    @Column(name = "movie_picture3")
    private String moviePicture3;

    @Column(name = "movie_picture4")
    private String moviePicture4;

    @Column(name = "movie_picture5")
    private String moviePicture5;

    @Column(name = "movie_picture6")
    private String moviePicture6;

    private String flag;

    /**
     * @return movie_id
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     * @param movieId
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
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
     * @return movie_posters
     */
    public String getMoviePosters() {
        return moviePosters;
    }

    /**
     * @param moviePosters
     */
    public void setMoviePosters(String moviePosters) {
        this.moviePosters = moviePosters == null ? null : moviePosters.trim();
    }

    /**
     * @return movie_star
     */
    public String getMovieStar() {
        return movieStar;
    }

    /**
     * @param movieStar
     */
    public void setMovieStar(String movieStar) {
        this.movieStar = movieStar == null ? null : movieStar.trim();
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
     * @return movie_picture1
     */
    public String getMoviePicture1() {
        return moviePicture1;
    }

    /**
     * @param moviePicture1
     */
    public void setMoviePicture1(String moviePicture1) {
        this.moviePicture1 = moviePicture1 == null ? null : moviePicture1.trim();
    }

    /**
     * @return movie_picture2
     */
    public String getMoviePicture2() {
        return moviePicture2;
    }

    /**
     * @param moviePicture2
     */
    public void setMoviePicture2(String moviePicture2) {
        this.moviePicture2 = moviePicture2 == null ? null : moviePicture2.trim();
    }

    /**
     * @return movie_picture3
     */
    public String getMoviePicture3() {
        return moviePicture3;
    }

    /**
     * @param moviePicture3
     */
    public void setMoviePicture3(String moviePicture3) {
        this.moviePicture3 = moviePicture3 == null ? null : moviePicture3.trim();
    }

    /**
     * @return movie_picture4
     */
    public String getMoviePicture4() {
        return moviePicture4;
    }

    /**
     * @param moviePicture4
     */
    public void setMoviePicture4(String moviePicture4) {
        this.moviePicture4 = moviePicture4 == null ? null : moviePicture4.trim();
    }

    /**
     * @return movie_picture5
     */
    public String getMoviePicture5() {
        return moviePicture5;
    }

    /**
     * @param moviePicture5
     */
    public void setMoviePicture5(String moviePicture5) {
        this.moviePicture5 = moviePicture5 == null ? null : moviePicture5.trim();
    }

    /**
     * @return movie_picture6
     */
    public String getMoviePicture6() {
        return moviePicture6;
    }

    /**
     * @param moviePicture6
     */
    public void setMoviePicture6(String moviePicture6) {
        this.moviePicture6 = moviePicture6 == null ? null : moviePicture6.trim();
    }

    /**
     * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}