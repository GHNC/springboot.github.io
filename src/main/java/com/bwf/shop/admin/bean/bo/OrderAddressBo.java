package com.bwf.shop.admin.bean.bo;

import com.bwf.shop.admin.bean.po.OrderInfo;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderAddressBo {
    private String consignee;//收货人姓名
    private Integer phone;//收货人手机号
    private String province;//省份/自治区/直辖市
    private String city;//城市
    private String district;//区/县
    private String address;//详细地址
    private Date updatetime;//更新时间
    private Integer orderNo;//关联的订单号
    private Integer id;
    private String order_no;
    private Integer order_status;
    private Integer order_paymode;
    private Date createtime;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }



    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Integer getOrder_paymode() {
        return order_paymode;
    }

    public void setOrder_paymode(Integer order_paymode) {
        this.order_paymode = order_paymode;
    }





    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
