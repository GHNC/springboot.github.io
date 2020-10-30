package com.bwf.shop.admin.service.impl;

import com.bwf.shop.admin.bean.bo.OrderAddressBo;
import com.bwf.shop.admin.bean.bo.OrderDetailsBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderAddress;
import com.bwf.shop.admin.bean.po.OrderDetails;
import com.bwf.shop.admin.mapper.OrderAddressMapper;
import com.bwf.shop.admin.mapper.OrderDetailsMapper;
import org.springframework.stereotype.Service;
import com.bwf.shop.admin.service.IOrderAddressService;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderAddressService implements IOrderAddressService{

    @Resource
    private OrderAddressMapper orderAddressMapper;


    @Override
    public List<OrderAddress> getTabAddress(OrderAddress orderAddress) {
        return orderAddressMapper.getTabAddress(orderAddress);
    }


}
