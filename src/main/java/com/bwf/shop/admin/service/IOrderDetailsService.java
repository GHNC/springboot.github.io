package com.bwf.shop.admin.service;

import com.bwf.shop.admin.bean.bo.OrderDetailsBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderDetails;
import com.bwf.shop.admin.bean.po.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOrderDetailsService {
    //获取order_details表格信息
    List<OrderDetails> getTabOrderDetails(OrderDetails orderDetails);
}
