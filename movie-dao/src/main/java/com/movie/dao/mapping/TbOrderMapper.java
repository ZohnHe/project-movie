package com.movie.dao.mapping;

import com.movie.dao.pojo.ChooseSeat;
import com.movie.dao.pojo.OrderResp;
import com.movie.dao.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbOrderMapper extends Mapper<TbOrder> {

    public List<OrderResp> selectOrderByOrderId(@Param("id") int id);
    public List<ChooseSeat> selectByIds(@Param("cinemaId") int cinemaId, @Param("movieId") int movieId, @Param("scnenId") int scnenId);
    public int unActive(@Param("orderId") int orderId);
    public int toPay(@Param("orderId") int orderId);
    public int insertUUID(@Param("tbOrder") TbOrder tbOrder);
    public int deleteOrder(@Param("id") int id);
}