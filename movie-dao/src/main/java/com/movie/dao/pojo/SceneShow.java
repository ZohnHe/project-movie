package com.movie.dao.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class SceneShow {
    private int id;
    private Integer parentId;
    private Integer movieId;
    private String viewingProjectionStart;
    private String viewingProjectionEnd;
    private String viewingTime;
    private String viewingLanguage;
    private String viewingHall;
    private int viewingPrice;
    private String cinemaName;
    private String movieName;
}
