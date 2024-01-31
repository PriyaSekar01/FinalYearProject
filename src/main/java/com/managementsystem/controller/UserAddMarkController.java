package com.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.managementsystem.entity.UserAddmark;
import com.managementsystem.service.UserAddMarkservice;

@Controller
public class UserAddMarkController {
	
	@Autowired
	UserAddMarkservice service;
	

	@GetMapping("/marks")
	public String listMarks(Model model) {
		model.addAttribute("marks", service.getAllMarks());
		return "mark";
	}
	
	@GetMapping("/marks/new")
	public String createMarkForm(Model model) {
		UserAddmark mark = new UserAddmark();
		model.addAttribute("mark", mark);
		return "new_mark";
		
	}
	
	@PostMapping("/saveMarks")
	public String saveMark(@ModelAttribute("mark") UserAddmark mark) {
		service.saveMarks(mark);
		return "redirect:/marks";
	}
	
	@GetMapping("/marks/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("mark", service.getMarkById(id));
		return "edit_mark";
	}

	@PostMapping("/marks/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("mark") UserAddmark mark,
			Model model) {
	UserAddmark existingStudent = service.getMarkById(id);

		existingStudent.setId(id);
		existingStudent.setName(mark.getName());
		existingStudent.setRegnumber(mark.getRegnumber());
		existingStudent.setMajor(mark.getMajor());
		existingStudent.setAllied(mark.getAllied());
		existingStudent.setMaths(mark.getMaths());
		
		existingStudent.setEnglish(mark.getEnglish());
		
		service.updateMark(existingStudent);
		return "redirect:/marks";		
	}
	

	
	@GetMapping("/marks/{id}")
	public String deleteMark(@PathVariable Long id) {
		service.deleteMarkById(id);
		return "redirect:/marks";
	}
	

}
