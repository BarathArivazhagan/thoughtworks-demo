package com.barath.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barath.app.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	User findByEmail(String email);

}
