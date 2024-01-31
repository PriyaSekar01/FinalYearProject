package com.managementsystem.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.managementsystem.entity.StudentLogin;
import com.managementsystem.repository.StudentLoginRepository;






@Controller
public class StudentLoginController {
	
	 @Autowired
	 private StudentLoginRepository repository;
	 
	  @GetMapping("/markTable")
	    public String ShowDetails() {
	    	return "MarkTable";
	    }

	 
	    @GetMapping("/studentlogin")
	    public String showLoginForm() {
	        return "StudentLogin";
	    }
	    
	    
	    @GetMapping("/studentLoginpage")
	    public String markList(@RequestParam("regnumber") String regnumber,
	                           @ModelAttribute("student") StudentLogin studentlogin, Model model) {
	        
	        StudentLogin login = repository.findByRegnumber(regnumber);

	        if (login != null) {
	            model.addAttribute("student", login);
	            return "StudentMarkTable";
	        } else {
	            
	            return "StudentNotFound"; 
	        }
	    }
	    
	    @GetMapping("/logoutStudent")
	     public String logout(SessionStatus sessionStatus) {
	         // Invalidate the session
	         sessionStatus.setComplete();
	         // Redirect to the login page after logout
	         return "redirect:/login";
	     }
	    
	   
}
	         
	         
	        
	    	
	    	

