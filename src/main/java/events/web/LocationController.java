package events.web;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import events.service.DefaultLocationService;
import events.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationController {

	private final LocationService service;
	
	public LocationController(DefaultLocationService locationService) {
		this.service = locationService;
	}
	
	@RequestMapping("/location/states")
	public List<String> getAllEventsInAState() {
		return service.getAllStates();
	}
	
	@RequestMapping("/location/cities/{state}")
	public List<String> getAllStates(@PathVariable String state) {
		return service.getAllCities(state);
	}
}
