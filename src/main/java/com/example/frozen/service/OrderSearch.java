package com.example.frozen.service;

import com.example.frozen.Entity.OrderStatus;
import lombok.Getter;
import lombok.Setter;

public class OrderSearch {

    private String memberName; //회원이름
    private OrderStatus orderStatus; //주문상태

    public String getMemberName() {return memberName;}

    public void setMemberName (String memberName) {
        this.memberName = memberName;}

    public OrderStatus getOrderStatus() {return  orderStatus;}
    public void setOrderStatus(OrderStatus orderStatus)
    {this.orderStatus = orderStatus;}
    }

