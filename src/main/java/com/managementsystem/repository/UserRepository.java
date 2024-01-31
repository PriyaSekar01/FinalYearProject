package com.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.managementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	


}
