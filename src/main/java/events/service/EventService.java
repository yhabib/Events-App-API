package events.service;

import java.util.List;

import events.domain.Event;

public interface EventService {
	
	Integer count();
	
	List<Event> findAll();

	Event findById(Long id) throws EventNotFoundException;
}
