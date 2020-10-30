package com.bwf.shop.admin.mapper;


import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderInfo;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrderMapper {


    List<OrderInfo> getOrderListByOrderStatus();

    List<OrderInfo> getAllOrderList(OrderInfoBO orderInfoBO);

    List<OrderInfo> getOrderPayMode();

    int updateOrder(@Param("orderInfoBO") OrderInfoBO orderInfoBO);



}
