package com.bwf.shop.admin.service;


import com.bwf.shop.admin.bean.bo.OrderAddressBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderAddress;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface IOrderAddressService {
    //获取order_address表格信息
    List<OrderAddress> getTabAddress(OrderAddress orderAddress);


}
