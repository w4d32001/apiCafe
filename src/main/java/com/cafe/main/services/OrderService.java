package com.cafe.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.main.models.OrderModel;
import com.cafe.main.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderModel> getOrders(){
        return orderRepository.findAll();
    }

    public OrderModel getOrderById(int id){
        return orderRepository.findById(id).orElse(null);
    }

    public OrderModel createOrder(OrderModel order) {
        return orderRepository.save(order);
    }
    
    public void deleteOrder(int id){
        orderRepository.deleteById(id);
    }

    public long totalOrders(){
        return orderRepository.count();
    }


}
