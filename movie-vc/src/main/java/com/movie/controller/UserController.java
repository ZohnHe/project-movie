package com.movie.controller;

import com.movie.common.BaseResponse;
import com.movie.dao.pojo.TbUser;
import com.movie.dao.pojo.ext.TbUserExt;
import com.movie.domain.UserInfoEntity;
import com.movie.domain.req.SaveUserImageReq;
import com.movie.domain.req.UserLoginReq;
import com.movie.domain.req.UserRegisterReq;
import com.movie.domain.resp.UserLoginResp;
import com.movie.domain.resp.UserModifyResp;
import com.movie.domain.resp.UserOrderResp;
import com.movie.service.UserService;
import com.movie.service.utils.RequestAssets;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller
@Api(tags="User")  //swagger分类标题注解
@RequestMapping(value = "/api/user")
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "用户登录测试")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<UserLoginResp> login(HttpServletRequest request, @Valid @RequestBody UserLoginReq userLoginReq, BindingResult errors){

        //参数请求验证
        RequestAssets.assetsError(errors);

        UserLoginResp userLoginResp = new UserLoginResp();
        TbUser tbUser = userService.userLogin(userLoginReq);
        if (tbUser != null){
            request.getSession().setAttribute("tbUser",tbUser);
            userLoginResp.setSuccess(1);
        }else {
            userLoginResp.setSuccess(0);
        }

        return new BaseResponse(userLoginResp);
    }

    @ApiOperation(value = "获得盐值")
    @RequestMapping(value = "/salt",method = RequestMethod.GET)
    @ResponseBody
    public String getSalt(String username){
        String salt = userService.getSalt(username);
        return salt;
    }

    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<UserInfoEntity> getUserInfo(HttpServletRequest request){
        TbUser tbUser = (TbUser)request.getSession().getAttribute("tbUser");
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        if (tbUser != null) {
            tbUser = userService.getUserById(tbUser.getId());
            Mapper mapper = new DozerBeanMapper();
            userInfoEntity = mapper.map(tbUser,UserInfoEntity.class);
            String birthday = tbUser.getBirthday();
            String[] birth = splitStr(birthday);
            if (birth != null && birth.length > 2){
                userInfoEntity.setBirth_year(birth[0]);
                userInfoEntity.setBirth_month(birth[1]);
                userInfoEntity.setBirth_day(birth[2]);
            }

            String interest = tbUser.getInterest();
            String[] interests = splitStr(interest);
            userInfoEntity.setInterests(interests);

            //该用户已登录
            userInfoEntity.setSuccess(1);
        }else {
            //该用户为登陆
            userInfoEntity.setSuccess(0);
        }
        return new BaseResponse(userInfoEntity);
    }

    @ApiOperation(value = "修改用户信息")
    @RequestMapping(value = "/modifyUser",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<UserModifyResp> modifyUser(@Valid @RequestBody UserInfoEntity userInfoEntity, BindingResult errors){

        //参数请求验证
        RequestAssets.assetsError(errors);

        Mapper mapper = new DozerBeanMapper();
        TbUser tbUser = mapper.map(userInfoEntity,TbUser.class);

        //生成日期格式 1999-1-11
        String[] date = {userInfoEntity.getBirth_year(),userInfoEntity.getBirth_month(),userInfoEntity.getBirth_day()};
        tbUser.setBirthday(StrFomat(date));

        //生成兴趣格式 1-3-5
        tbUser.setInterest(StrFomat(userInfoEntity.getInterests()));

        UserModifyResp userModifyResp = new UserModifyResp();
        userModifyResp.setSuccess(userService.modifyUserById(tbUser));

        return new BaseResponse(userModifyResp);
    }

    @ApiOperation(value = "上传头像")
    @RequestMapping(value = "/saveUserImage",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<Integer> saveUserImage(@Valid @RequestBody SaveUserImageReq saveUserImageReq, BindingResult errors){

        //参数请求验证
        RequestAssets.assetsError(errors);

        int index = userService.saveUserImage(saveUserImageReq);
        return new BaseResponse(index);
    }

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<UserLoginResp> register(@Valid @RequestBody UserRegisterReq userRegisterReq, BindingResult errors){

        //参数请求验证
        RequestAssets.assetsError(errors);

        Mapper mapper = new DozerBeanMapper();
        TbUser tbUser = mapper.map(userRegisterReq,TbUser.class);
        tbUser.setUsername(UUID.randomUUID().toString().toUpperCase().substring(1,10));

        int index = userService.userRegister(tbUser);

        return new BaseResponse(index);
    }

    @ApiOperation(value = "手机是否存在")
    @RequestMapping(value = "/getPhone",method = RequestMethod.GET)
    @ResponseBody
    public String getPhone(String phone){
        return String.valueOf(userService.getPhone(phone));
    }

    @ApiOperation(value = "退出登录")
    @RequestMapping(value = "/mUserLogOut",method = RequestMethod.GET)
    @ResponseBody
    public void mUserLogOut(HttpServletRequest request){
        request.getSession().invalidate();
    }

    @ApiOperation(value = "用户订单")
    @RequestMapping(value = "/getMyOrder",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<UserOrderResp> getMyOrder(HttpServletRequest request){

        TbUser tbUser = (TbUser)request.getSession().getAttribute("tbUser");
        UserOrderResp userOrderResp = new UserOrderResp();
        if (tbUser != null) {
            List<TbUserExt> list = userService.getMyOrder(tbUser.getId());
            if (list != null && !list.isEmpty()){
                userOrderResp.setList(list);
            }
            //该用户已登录
            userOrderResp.setSuccess(1);
        }else {
            //该用户为登陆
            userOrderResp.setSuccess(0);
        }
        return new BaseResponse(userOrderResp);

        /*UserOrderResp userOrderResp = new UserOrderResp();
        List<TbUserExt> list = userService.getMyOrder(id);
        userOrderResp.setList(list);
        userOrderResp.setTotalSeat(userService.getTotalSeat(id));
        userOrderResp.setSuccess(1);
        return new BaseResponse(userOrderResp);*/
    }

    /**
     * 生成拼接格式：1-5-9
     * @param strs  传入String型数组
     * @return
     */
    private String StrFomat(String[] strs){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i < strs.length ; i ++){
            stringBuffer.append(strs[i]);
            if (i < strs.length - 1){
                stringBuffer.append("-");
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 根据"-"分割
     * @param str
     * @return
     */
    private String[] splitStr(String str){
        if (str == null || str == ""){
            return null;
        }
        String[] split = str.split("-");
        return split;
    }
}
