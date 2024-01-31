package com.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.managementsystem.entity.UserAddmark;
@Repository
public interface UserAddMarksRepository extends JpaRepository<UserAddmark, Long>{
	

}
