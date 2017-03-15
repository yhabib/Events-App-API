package events.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	// logic in the service layer instead here !!! to be refactored after tests!!!!
	@GetMapping("/events")
	public List<Event> getAllEvents(@RequestParam(required=false) String state, @RequestParam(required=false) String city) {
		if(state == null)
			return service.findAll();
		else if(state != null && city == null) 
			return service.findAllByState(state);
		else
			return service.findAllByStateAndCity(state, city);
	}
	
	@GetMapping("/events/{eventId}")
	public Event getEventById(@PathVariable Long eventId) {
		return service.findById(eventId);
	}
	
	
	@GetMapping("/events/count")
	public Long getNumberOfEvents() {
		return service.count();
	}
}
