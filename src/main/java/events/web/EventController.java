package events.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import events.domain.Event;
import events.service.DefaultEventService;
import events.service.EventService;

@RestController
@RequestMapping("/api")
public class EventController {
	
	private final EventService service;
	
	public EventController(DefaultEventService eventService) {
		this.service = eventService;
	}
	
	@GetMapping("/events")
	public List<Event> getAllEvents() {
		return service.findAll();
	}
}
