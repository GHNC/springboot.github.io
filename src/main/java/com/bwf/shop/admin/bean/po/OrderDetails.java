package com.bwf.shop.admin.bean.po;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderDetails {
    private Integer id;
    private Integer odtails_spu_id;//商品id
    private String order_remark;//订单备注
    private String odtails_name;//商品名称
    private String odtails_thumburl;//封面图片
    private Integer odtails_price;//商品价格
    private Integer odtails_count;//商品数量
    private Integer odtails_amount;//小计金额
    private Integer odtails_scorestatus;//评价状态 0.待评价 1.已评价
    private Integer odtails_sku_id;//商品规格id
    private Integer odtails_orderno_id;//关联的订单号
    private Integer order_no;
    private Integer order_status;
    private Integer order_paymode;

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOdtails_orderno_id() {
        return odtails_orderno_id;
    }

    public void setOdtails_orderno_id(Integer odtails_orderno_id) {
        this.odtails_orderno_id = odtails_orderno_id;
    }

    private Date createtime;//创建时间
    private Date updatetime;//更新时间

    public Integer getOdtails_spu_id() {
        return odtails_spu_id;
    }

    public void setOdtails_spu_id(Integer odtails_spu_id) {
        this.odtails_spu_id = odtails_spu_id;
    }

    public String getOrder_remark() {
        return order_remark;
    }

    public void setOrder_remark(String order_remark) {
        this.order_remark = order_remark;
    }

    public String getOdtails_name() {
        return odtails_name;
    }

    public void setOdtails_name(String odtails_name) {
        this.odtails_name = odtails_name;
    }

    public String getOdtails_thumburl() {
        return odtails_thumburl;
    }

    public void setOdtails_thumburl(String odtails_thumburl) {
        this.odtails_thumburl = odtails_thumburl;
    }

    public Integer getOdtails_price() {
        return odtails_price;
    }

    public void setOdtails_price(Integer odtails_price) {
        this.odtails_price = odtails_price;
    }

    public Integer getOdtails_count() {
        return odtails_count;
    }

    public void setOdtails_count(Integer odtails_count) {
        this.odtails_count = odtails_count;
    }

    public Integer getOdtails_amount() {
        return odtails_amount;
    }

    public void setOdtails_amount(Integer odtails_amount) {
        this.odtails_amount = odtails_amount;
    }

    public Integer getOdtails_scorestatus() {
        return odtails_scorestatus;
    }

    public void setOdtails_scorestatus(Integer odtails_scorestatus) {
        this.odtails_scorestatus = odtails_scorestatus;
    }

    public Integer getOdtails_sku_id() {
        return odtails_sku_id;
    }

    public void setOdtails_sku_id(Integer odtails_sku_id) {
        this.odtails_sku_id = odtails_sku_id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
