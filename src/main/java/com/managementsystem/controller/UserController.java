package com.managementsystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.managementsystem.entity.Login;
import com.managementsystem.entity.User;
import com.managementsystem.repository.LoginRepository;
import com.managementsystem.repository.UserRepository;




@Controller
public class UserController {
	
	
	
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("user",new User());
		return "home";
	}
	
    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login_page";
	    }
     @PostMapping("/save")
	public String signUpform(User user) {
		Login login = new Login();
		login.setEmail(user.getEmail());
		login.setPassword(user.getPassword());
		loginRepository.save(login);
		repository.save(user);
		return "redirect:/students";
	}

     
     @PostMapping("/loginpage")
     public String login(@RequestParam ("email") String email, @RequestParam ("password")String password, Model model) {
         
       Login login = loginRepository.findByEmailAndPassword(email,password);

         if (login != null && login.getEmail().equals(email)&& login.getPassword().equals(password)) {
           
             model.addAttribute("username", email);
             return "redirect:/students"; 
         } else {
           
             model.addAttribute("error", "Invalid username or password");
             return "redirect:/login";
         }
     }
     
     @GetMapping("/logout")
     public String logout(SessionStatus sessionStatus) {
         // Invalidate the session
         sessionStatus.setComplete();
         // Redirect to the login page after logout
         return "redirect:/login";
     }
 }
    		 
    		 
    	 
     
     
    			
 	
     
     
     
     
     
     
     
     
 
	

		 
		 

	
	
				
					
				
			
	
			

	

	
		

	
	
	

	


