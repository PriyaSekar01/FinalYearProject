package com.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managementsystem.entity.Event;
@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
