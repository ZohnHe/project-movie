package com.movie.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BackDataReq {
    @ApiModelProperty("当前页码")
    private int whichPage;

    @ApiModelProperty("当前页有几条数据")
    private int pageSize;
}
