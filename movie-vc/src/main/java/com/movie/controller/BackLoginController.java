package com.movie.controller;

import com.movie.domain.BackLoginReq;
import com.movie.service.AdministratorsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(tags = "用户登录接口")
@Controller
@RequestMapping(value = "/api/admin")
public class BackLoginController {

    @Resource
    AdministratorsService administratorsService;

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    @ResponseBody
    public String backLogin(@Valid @RequestBody BackLoginReq blq){
        return administratorsService.judgementLogin(blq);
    }
}
