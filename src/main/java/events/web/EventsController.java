package events.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import events.domain.Event;
import events.service.EventService;

@RestController
@RequestMapping("/api")
public class EventsController {
	private final EventService service;
	
	public EventsController(EventService eventService) {
		this.service = eventService;
	}
	
	@GetMapping("/events")
	public List<Event> getAllEvents() {
		return service.findAll();
	}
}
