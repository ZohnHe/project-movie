package com.movie.controller;

import com.movie.common.BaseResponse;
import com.movie.dao.pojo.*;
import com.movie.domain.TicketReq;
import com.movie.domain.req.DeleteReq;
import com.movie.entity.resp.DeleteResp;
import com.movie.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
public class TicketController {
    @Resource
    OrderService orderService;

    /**
     * 选座页面获得场次信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/getSceneAndMovie" ,method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse getSceneAndMovie(HttpServletRequest request){
        int cinemaId = Integer.parseInt((String) request.getSession().getAttribute("cinemaId"));
        int movieId =  Integer.parseInt((String)request.getSession().getAttribute("movieId"));
        int scnenId = Integer.parseInt((String)request.getSession().getAttribute("scnenId"));
        ChooseSeat chooseSeat = orderService.selectByIds(cinemaId, movieId, scnenId);
        BaseResponse<ChooseSeat> response = new BaseResponse<>();
        response.setData(chooseSeat);
        return response;
    }

    /**
     * 获得不是空闲的位置
     * @return
     */
    @RequestMapping(value = "/getNotEmptySeat" ,method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<List> getNotEmptyseat(HttpServletRequest request){
        //TODO 获得场次id
        List<TbSeat> list = orderService.selectBySceneId(Integer.parseInt((String)request.getSession().getAttribute("scnenId")));
        BaseResponse<List> response = new BaseResponse<>();
        response.setData(list);
        return response;
    }

    /**
     * 生成订单
     * @param ticketreq
     * @param request
     * @return
     */
    @RequestMapping(value = "/buyTicket",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse buyTicket(@RequestBody TicketReq ticketreq , HttpServletRequest request){
        TbUser user = (TbUser) request.getSession().getAttribute("tbUser");
        //user=new TbUser();
        //user.setUsername("662");
        //user.setId(1);
        //request.getSession().setAttribute("user",user);
        if(user!=null){
            TbOrder tbOrder = orderService.creatOrder(ticketreq, user,request);
            request.getSession().setAttribute("order",tbOrder);
        }
        return new BaseResponse();
    }

    /**
     * 未登录则跳转到登陆页面
     * @param request
     * @param scnenId
     * @return
     */
    @RequestMapping(value = "/xseat",method = RequestMethod.GET)
    public String ll(HttpServletRequest request ,String scnenId){
        request.getSession().setAttribute("scnenId",scnenId);
        TbUser user = (TbUser)request.getSession().getAttribute("tbUser");
       // TbUser user = new TbUser();
        //user.setId(1);
        if(user!=null){
            return "choose_seat";
        }
        else{
            return "login";
        }
    }

    /**
     * 订单数据回显
     * @param request
     * @return
     */
    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<OrderResp> getOrder(HttpServletRequest request){
       /* TbUser user = (TbUser)request.getSession().getAttribute("user");
        OrderResp resp = orderService.selectOrderByOrderId(user.getId());*/
        TbOrder order = (TbOrder) request.getSession().getAttribute("order");
        OrderResp resp = orderService.selectOrderByOrderId(order.getId());
        BaseResponse<OrderResp> response = new BaseResponse<>();
        response.setData(resp);
        return response;
    }
    @RequestMapping(value = "/unActive",method = RequestMethod.GET)
    @ResponseBody
    public String  unActive(HttpServletRequest request){
        TbOrder order = (TbOrder) request.getSession().getAttribute("order");
        orderService.unActive(order.getId());
        return "xxx";
    }

    /**
     * 支付，生成订单码
     * @param request
     * @return
     */
    @RequestMapping(value = "toPay" ,method = RequestMethod.GET)
    @ResponseBody
    public String toPay(HttpServletRequest request){
        TbOrder order = (TbOrder) request.getSession().getAttribute("order");
        orderService.toPay(order.getId());
        int seat1 = Integer.parseInt(order.getSeat1().split("-")[1]);
        TbSeat tbSeat1 = new TbSeat();
        tbSeat1.setMovieScene(order.getMovivScene());
        tbSeat1.setSeatid(seat1);
        orderService.inseartSeat(tbSeat1);
        if(order.getSeat2()!=null&&!"".equals(order.getSeat2())){
            int seat2=Integer.parseInt(order.getSeat2().split("-")[1]);
            TbSeat tbSeat2 = new TbSeat();
            tbSeat2.setMovieScene(order.getMovivScene());
            tbSeat2.setSeatid(seat2);
            orderService.inseartSeat(tbSeat2);
        }
        String uuid = UUID.randomUUID().toString();
        order.setTicketNumber(uuid);
        orderService.insertUUID(order);
        return uuid;
    }

    /**
     * 删除订单，假删除
     * @return
     */
    @RequestMapping(value = "/delete" ,method = RequestMethod.POST)
    @ResponseBody
    public DeleteResp deleteOrder(@RequestBody  DeleteReq deleteReq){
        //System.out.println("--------------"+id1);
        int id=Integer.parseInt(deleteReq.getOrderId());
        int i = orderService.deleteOrder(id);
        DeleteResp resp = new DeleteResp();
        resp.setSuccess(i);
        return resp;
    }






}
