package com.ProjectWebService.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.Course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	
}
