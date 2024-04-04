package com.example.frozen.service;

import com.example.frozen.Entity.*;
import com.example.frozen.repository.MemberRepository;
import com.example.frozen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ItemService itemService;


    //주문
    public Long order(Long memberId, Long itemId, int count){

        //엔티티 조회
        Member member = memberRepository.fineOne(memberId);
        Item item = itemService.fineOne(itemId);

        //배송정보 생성
        Delivery delivery = new

        OrderItem orderItem =
                OrderItem.createOrderItem(item, item.getPrice(), count);

        Order order = Order.createOrder(member, delivery, orderItem);
        orderRepository.save(order);
        return order.getId();
    }

    public void cancelOrder(Long orderId) {

        Order order = orderRepository.fineOne(orderId);

        order.cancel();
    }

    public List<Order> findOrders(OrderSearch orderSearch) {
        return orderRepository.findAll(orderSearch);
    }
}
