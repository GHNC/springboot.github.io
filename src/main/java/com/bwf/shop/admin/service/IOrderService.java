package com.bwf.shop.admin.service;

import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface IOrderService {
     //直接获取所有订单状态用于selecter页面选择下拉列表
        List<OrderInfo> getOrderListByOrderStatus();
    //获取现存的所有订单信息
        List<OrderInfo> getAllOrderList(OrderInfoBO orderInfoBO);
    //获取现存的所有订单支付方式
        List<OrderInfo> getOrderPayMode();

        boolean updateOrder(@Param("orderInfoBO") OrderInfoBO orderInfoBO);

}
