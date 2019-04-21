package com.movie.domain.req;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class UserLoginReq {
    @ApiModelProperty("用户名")
    @NotEmpty(message = "用户名不能为空!")
    private String username;

    @ApiModelProperty("密码")
    @NotEmpty(message = "密码不能为空!")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
