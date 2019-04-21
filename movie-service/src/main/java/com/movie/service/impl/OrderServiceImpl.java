package com.movie.service.impl;

import com.movie.dao.mapping.TbOrderMapper;
import com.movie.dao.mapping.TbSeatMapper;
import com.movie.dao.pojo.*;
import com.movie.domain.TicketReq;
import com.movie.service.OrderService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {



    @Resource
    TbOrderMapper tbOrderMapper;
    @Resource
    TbSeatMapper tbSeatMapper;


    @Override
    public TbOrder creatOrder(TicketReq ticketReq , TbUser user, HttpServletRequest request) {

        TbOrder tbOrder = new TbOrder();
        tbOrder.setUserId(user.getId());
        tbOrder.setCreatTime(new Date());
        //TODO　设置影院id，电影id，场次id
        tbOrder.setPayCount(Integer.parseInt(ticketReq.getPrice()));
        tbOrder.setCinemaId(Integer.parseInt((String)request.getSession().getAttribute("cinemaId")));
        tbOrder.setMovieId(Integer.parseInt((String)request.getSession().getAttribute("movieId")));
        tbOrder.setMovivScene(Integer.parseInt((String)request.getSession().getAttribute("scnenId")));
        tbOrder.setIsPay(0);
        tbOrder.setSeat1(ticketReq.getSeat1());
        tbOrder.setIsActive("1");
        if(ticketReq.getSeat2()!=null&&!"".equals(ticketReq.getSeat2())){
            tbOrder.setSeat2(ticketReq.getSeat2());
        }
        int insert = tbOrderMapper.insert(tbOrder);
        Example example = new Example(TbOrder.class);
        example.createCriteria().andEqualTo("userId",user.getId())
                .andEqualTo("creatTime",tbOrder.getCreatTime());
        List<TbOrder> list = tbOrderMapper.selectByExample(example);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public OrderResp selectOrderByOrderId(int id) {
        return tbOrderMapper.selectOrderByOrderId(id).get(0);
    }

    @Override
    public List<TbSeat> selectBySceneId(int movie_scene) {

        return tbSeatMapper.selectBySceneId(movie_scene);
    }

    @Override
    public ChooseSeat selectByIds(int cinemaId, int movieId, int scnenId) {
        return tbOrderMapper.selectByIds(cinemaId,movieId,scnenId).get(0);
    }

    @Override
    public int unActive(int orderId) {
        return tbOrderMapper.unActive(orderId);
    }

    @Override
    public int toPay(int orderId) {
        return tbOrderMapper.toPay(orderId);
    }

    @Override
    public void inseartSeat(TbSeat tbSeat) {
        tbSeatMapper.insert(tbSeat);
    }

    @Override
    public void insertUUID(TbOrder order) {
        tbOrderMapper.insertUUID(order);
    }

    @Override
    public int deleteOrder(int id) {
        return tbOrderMapper.deleteOrder(id);
    }
}
