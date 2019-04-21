package com.movie.controller;

import com.movie.domain.BackIdReq;
import com.movie.service.DeleteDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Api(tags = "删除数据接口")
@RequestMapping(value = "/api/admin")
public class DeleteDataConreoller {

    @Resource
    DeleteDataService deleteDataService;

    @RequestMapping(value = "/back/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除数据")
    @ResponseBody
    public String deleteData(@RequestBody BackIdReq backIdReq){
        //调用Service
        int j = Integer.parseInt(backIdReq.getId());
        int i = deleteDataService.deleteOne(j, backIdReq.getName());
        return String.valueOf(i);
    }
}
