package com.movie.dao.pojo;

import javax.persistence.*;

@Table(name = "m_seat_noempty")
public class TbSeat {
    @Column(name = "movie_scene")
    private Integer movieScene;

    private Integer seatid;

    /**
     * @return movie_scene
     */
    public Integer getMovieScene() {
        return movieScene;
    }

    /**
     * @param movieScene
     */
    public void setMovieScene(Integer movieScene) {
        this.movieScene = movieScene;
    }

    /**
     * @return seatid
     */
    public Integer getSeatid() {
        return seatid;
    }

    /**
     * @param seatid
     */
    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }
}