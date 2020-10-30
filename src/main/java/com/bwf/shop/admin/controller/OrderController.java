package com.bwf.shop.admin.controller;

import com.bwf.shop.admin.bean.bo.OrderAddressBo;
import com.bwf.shop.admin.bean.bo.OrderDetailsBo;
import com.bwf.shop.admin.bean.bo.OrderInfoBO;
import com.bwf.shop.admin.bean.po.OrderAddress;
import com.bwf.shop.admin.bean.po.OrderDetails;
import com.bwf.shop.admin.bean.po.OrderInfo;
import com.bwf.shop.admin.service.IOrderAddressService;
import com.bwf.shop.admin.service.IOrderDetailsService;
import com.bwf.shop.admin.service.IOrderService;
import com.bwf.shop.admin.service.impl.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping(value = {"/","/order"})
public class OrderController {

    @Resource
    private IOrderService orderService;

    @Resource
    private IOrderAddressService orderAddressService;

    @Resource
    private IOrderDetailsService orderDetailsService;

    @RequestMapping(value = {"/","/selecter"})
    public String select(Model model){

        List<OrderInfo> orderStatus = orderService.getOrderListByOrderStatus();
        List<OrderInfo> orderPayMode = orderService.getOrderPayMode();
        model.addAttribute("orderStatus",orderStatus);
        model.addAttribute("orderPayMode",orderPayMode);
        return "order/selecter";
    }

    @RequestMapping(value = {"/","/order"})
    public String order( OrderInfoBO orderInfoBO, Model model){

        List<OrderInfo> orderInfoList = orderService.getAllOrderList(orderInfoBO);
        model.addAttribute("orderInfoList",orderInfoList);

        return "order/order";
    }

    @RequestMapping(value = {"/","/update"})
    public String update(OrderInfoBO orderInfoBO, OrderAddress orderAddress, OrderDetails orderDetails, Model model){

        List<OrderAddress> Address = orderAddressService.getTabAddress(orderAddress);
        List<OrderDetails> Details = orderDetailsService.getTabOrderDetails(orderDetails);
        List<OrderInfo> orderInfoList = orderService.getAllOrderList(orderInfoBO);
        List<OrderInfo> orderStatus = orderService.getOrderListByOrderStatus();
        List<OrderInfo> orderPayMode = orderService.getOrderPayMode();
        model.addAttribute("orderStatus",orderStatus);
        model.addAttribute("orderPayMode",orderPayMode);
        model.addAttribute("orderInfoList",orderInfoList);
        model.addAttribute("Details",Details);
        model.addAttribute("Address",Address);

        return "order/update";
    }

    @RequestMapping(value = {"/","/updateSelecter"})
    public String updateSelecter(OrderInfoBO orderInfoBO, OrderAddress orderAddress, OrderDetails orderDetails, Model model){

        List<OrderAddress> Address = orderAddressService.getTabAddress(orderAddress);
        List<OrderDetails> Details = orderDetailsService.getTabOrderDetails(orderDetails);
        List<OrderInfo> orderInfoList = orderService.getAllOrderList(orderInfoBO);
        List<OrderInfo> orderStatus = orderService.getOrderListByOrderStatus();
        List<OrderInfo> orderPayMode = orderService.getOrderPayMode();
        model.addAttribute("orderStatus",orderStatus);
        model.addAttribute("orderPayMode",orderPayMode);
        model.addAttribute("orderInfoList",orderInfoList);
        model.addAttribute("Details",Details);
        model.addAttribute("Address",Address);

        return "order/updateSelecter";
    }

    @RequestMapping(value = {"/","/exu"})
    public String exu(@Param("orderInfoBO") OrderInfoBO orderInfoBO , Model model) {

        boolean result = orderService.updateOrder(orderInfoBO);

        if(result){
            model.addAttribute("messages",new String[]{"order修改成功"});
            model.addAttribute("back","/order/update");
            return "order/info";
        }else {
            model.addAttribute("messages",new String[]{"员工修改执行失败！"});
            model.addAttribute("back","/order/update");
            return "order/info";
        }

    }

}
