package com.bwf.shop.admin.mapper;

import com.bwf.shop.admin.bean.bo.OrderAddressBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderAddressMapper {

    List<OrderAddress> getTabAddress(OrderAddress orderAddress);



}
