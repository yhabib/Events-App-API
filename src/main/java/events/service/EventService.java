package events.service;

import java.util.List;

import events.domain.Event;

public interface EventService {
	
	Long count();

	Event findById(Long id) throws EventNotFoundException;
	
	List<Event> findAll();
		
	List<Event> findAllByState(String state);
	
	List<Event> findAllByStateAndCity(String state, String city);

}
