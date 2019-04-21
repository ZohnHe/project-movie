package com.movie.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;


@Setter
@Getter
public class BackLoginReq {
    @ApiModelProperty("用户名")
    @NotBlank(message = "username不能为空")
    private String username;

    @ApiModelProperty("密码")
    @NotBlank(message = "password不能为空")
    private String password;
}
