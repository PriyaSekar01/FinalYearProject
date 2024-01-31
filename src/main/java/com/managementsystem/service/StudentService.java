package com.managementsystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.managementsystem.entity.Student;

import com.managementsystem.repository.StudentRepository;





@Service
public class StudentService {
	
	
	@Autowired
	 private StudentRepository repository;
	

	
	

		
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	
	public Student saveStudent(Student student) {
	
		
		return repository.save(student);
	}


	public Student getStudentById(Long id) {
		return repository.findById(id).get();
	}

	
	public Student updateStudent(Student student) {
		return repository.save(student);
	}


	public void deleteStudentById(Long id) {
		repository.deleteById(id);	
	}


}

