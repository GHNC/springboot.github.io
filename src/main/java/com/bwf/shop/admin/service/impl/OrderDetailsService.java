package com.bwf.shop.admin.service.impl;

import com.bwf.shop.admin.bean.bo.OrderDetailsBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderDetails;
import com.bwf.shop.admin.bean.po.OrderInfo;
import com.bwf.shop.admin.mapper.OrderDetailsMapper;
import org.springframework.stereotype.Service;
import com.bwf.shop.admin.service.IOrderDetailsService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderDetailsService implements IOrderDetailsService{

    @Resource
    private OrderDetailsMapper orderDetailsMapper;

    @Override
    public List<OrderDetails> getTabOrderDetails(OrderDetails orderDetails){
        return orderDetailsMapper.getTabOrderDetails(orderDetails);
    }
}
