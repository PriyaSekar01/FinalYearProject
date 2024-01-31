package com.managementsystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.managementsystem.entity.StudentLogin;

@Repository
public interface StudentLoginRepository extends JpaRepository<StudentLogin, Long> {
	
	StudentLogin findByRegnumber(String regnumber);
	
	
}
