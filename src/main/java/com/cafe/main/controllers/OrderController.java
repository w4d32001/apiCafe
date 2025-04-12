package com.cafe.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.main.models.OrderModel;
import com.cafe.main.services.OrderService;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAll")
    public List<OrderModel> getAll() {
        return orderService.getOrders();
    }

    @PostMapping("/save")
    public OrderModel save(@RequestBody OrderModel orderModel) {
        return orderService.createOrder(orderModel);
    }

    @PutMapping("/update/{id}")
    public OrderModel update(@PathVariable int id, @RequestBody OrderModel orderModel) {
        return orderService.updateOrder(id, orderModel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        orderService.deleteOrder(id);
    }

}
