package com.bwf.shop.admin.service.impl;

import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderInfo;
import com.bwf.shop.admin.mapper.OrderMapper;
import com.bwf.shop.admin.service.IOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<OrderInfo> getOrderListByOrderStatus(){
        return orderMapper.getOrderListByOrderStatus();
    }

    @Override
    public List<OrderInfo> getAllOrderList(OrderInfoBO orderInfoBO) {
        return orderMapper.getAllOrderList(orderInfoBO);
    }

    @Override
    public List<OrderInfo> getOrderPayMode() {
        return orderMapper.getOrderPayMode();
    }

    @Override
    public boolean updateOrder( OrderInfoBO orderInfoBO) {
        int a = orderMapper.updateOrder(orderInfoBO);
        return a>0;
    }


}
