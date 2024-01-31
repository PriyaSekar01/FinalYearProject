package com.managementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managementsystem.entity.StudentLogin;
import com.managementsystem.entity.UserAddmark;
import com.managementsystem.repository.StudentLoginRepository;
import com.managementsystem.repository.UserAddMarksRepository;

@Service
public class UserAddMarkservice {
	
	@Autowired
	UserAddMarksRepository repository;
	
	@Autowired
	StudentLoginRepository studentRepo;
	
	public List<UserAddmark> getAllMarks() {
		return repository.findAll();
	}

	
	public UserAddmark saveMarks(UserAddmark mark) {
		StudentLogin smark = new StudentLogin();
		smark.setId(mark.getId());
		smark.setName(mark.getName());
		smark.setRegnumber(mark.getRegnumber());
		smark.setMajor(mark.getMajor());
		smark.setAllied(mark.getAllied());
		smark.setMaths(mark.getMaths());
		smark.setEnglish(mark.getEnglish());
		studentRepo.save(smark);
		return repository.save(mark);
	}


	public UserAddmark getMarkById(Long id) {
		return repository.findById(id).get();
	}

	
	public UserAddmark updateMark(UserAddmark mark) {
		return repository.save(mark);
	}


	public void deleteMarkById(Long id) {
		repository.deleteById(id);	
	}
	
	

}
