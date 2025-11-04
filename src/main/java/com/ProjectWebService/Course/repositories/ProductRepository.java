package com.ProjectWebService.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
