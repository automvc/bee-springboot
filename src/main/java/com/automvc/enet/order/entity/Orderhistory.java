/*
 * Copyright 2016-2019 the original author.All rights reserved.
 * Kingstar(aiteasoft@163.com)
 * The license,see the LICENSE file.
 */

package com.automvc.enet.order.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author AiTeaSoft.com
 * @since  1.0
 * Create on 2019-04-16 11:48:24
 */
public class Orderhistory implements Serializable {

	private static final long serialVersionUID = 15960497491733462L;
	
    private Integer id;
    private String name;
    private String orderNo;
    private String seqNO;
    private BigDecimal num;
    private String numFlag;
    private String type;
    private String detail;
    private Timestamp datetime;
    private String remark;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }
   
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
   
    public String getOrderNo() {
	return orderNo;
    }

    public void setOrderNo(String orderNo) {
	this.orderNo = orderNo;
    }
   
    public String getSeqNO() {
	return seqNO;
    }

    public void setSeqNO(String seqNO) {
	this.seqNO = seqNO;
    }
   
    public BigDecimal getNum() {
	return num;
    }

    public void setNum(BigDecimal num) {
	this.num = num;
    }
   
    public String getNumFlag() {
	return numFlag;
    }

    public void setNumFlag(String numFlag) {
	this.numFlag = numFlag;
    }
   
    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }
   
    public String getDetail() {
	return detail;
    }

    public void setDetail(String detail) {
	this.detail = detail;
    }
   
    public Timestamp getDatetime() {
	return datetime;
    }

    public void setDatetime(Timestamp datetime) {
	this.datetime = datetime;
    }
   
    public String getRemark() {
	return remark;
    }

    public void setRemark(String remark) {
	this.remark = remark;
    }
   

	 public String toString(){	
		 StringBuffer str=new StringBuffer();	
		 str.append("Orderhistory[");
		 str.append("id=").append(id);	
		 str.append(",name=").append(name);	
		 str.append(",orderNo=").append(orderNo);	
		 str.append(",seqNO=").append(seqNO);	
		 str.append(",num=").append(num);	
		 str.append(",numFlag=").append(numFlag);	
		 str.append(",type=").append(type);	
		 str.append(",detail=").append(detail);	
		 str.append(",datetime=").append(datetime);	
		 str.append(",remark=").append(remark);	
		 str.append("]");			 
		 return str.toString();	
	 }				 
}