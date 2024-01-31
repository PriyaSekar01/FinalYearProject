package com.managementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managementsystem.entity.Event;
import com.managementsystem.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getAll() {
		return eventRepository.findAll();
	}

	
	public Event saveEvent(Event event) {
		
		return eventRepository.save(event);
	}


	public List<Event> getEventsDetails() {
		return eventRepository.findAll();
	}

}
