package com.ProjectWebService.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.Course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> { 
	
	
}
