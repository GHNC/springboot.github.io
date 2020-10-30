package com.bwf.shop.admin.mapper;

import com.bwf.shop.admin.bean.bo.OrderDetailsBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderDetails;
import com.bwf.shop.admin.bean.po.OrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsMapper {

    List<OrderDetails> getTabOrderDetails(OrderDetails orderDetails);

}
