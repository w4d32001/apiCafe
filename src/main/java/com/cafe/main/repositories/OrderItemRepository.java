package com.cafe.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.main.models.OrderItemModel;

public interface OrderItemRepository extends JpaRepository<OrderItemModel, Integer >{
    
}
