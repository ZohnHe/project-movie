package com.movie.entity.req;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MovieListResp<T> {
    /**
     * 总页数
     */
    private Object pageCount;

    /**
     * 本页的数据
     */
    private List<T> data;
}
