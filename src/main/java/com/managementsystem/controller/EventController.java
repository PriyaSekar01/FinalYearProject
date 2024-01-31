package com.managementsystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.managementsystem.entity.Event;

import com.managementsystem.service.EventService;


@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;

	    @GetMapping("/eventTable")
	    public String showCreateForm(Model model) {
	        model.addAttribute("event", new Event());
	        return "event"; 
	    }
	    
	    @GetMapping("/successMessage")
	    public String showSuccessMessage(Model model) {
	        model.addAttribute("event", new Event());
	        return "successMessage"; 
	    }
	
	    
	
	    
	    @PostMapping("/saveEvent")
		public String saveStudent(@ModelAttribute("event") Event event) {
	    	eventService.saveEvent(event);
			return "redirect:/successMessage";
		}
	    
	    @GetMapping("/eventsDetails")
		public String listStudents(Model model) {
			model.addAttribute("event", eventService.getEventsDetails());
			return "eventDetails";
		}

	   
	

	   

}
