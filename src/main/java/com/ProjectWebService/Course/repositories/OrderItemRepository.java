package com.ProjectWebService.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.Course.entities.OrderItem;
import com.ProjectWebService.Course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> { 
	
	
}
