package com.movie.service;

import com.movie.dao.pojo.*;
import com.movie.domain.TicketReq;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrderService {

    public TbOrder creatOrder(TicketReq ticketReq, TbUser user, HttpServletRequest request);
    public OrderResp selectOrderByOrderId(int id);
    public List<TbSeat> selectBySceneId( int movie_scene);
    public ChooseSeat selectByIds(int cinemaId,int movieId, int scnenId);
    public int unActive(int orderId);
    public int toPay(int orderId);
    public void inseartSeat(TbSeat tbSeat);
    public void insertUUID(TbOrder order);
    public int deleteOrder(int id);
}
