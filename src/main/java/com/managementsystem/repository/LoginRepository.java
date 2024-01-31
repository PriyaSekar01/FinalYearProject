package com.managementsystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.managementsystem.entity.Login;


public interface LoginRepository extends JpaRepository<Login, Long>{

	
	@Query("SELECT  l FROM Login l WHERE l.email = :email AND l.password = :password")
    Login findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
	}










