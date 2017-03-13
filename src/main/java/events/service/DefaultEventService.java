package events.service;

import java.util.List;

import events.domain.Event;
import events.repository.EventRepository;

public class DefaultEventService implements EventService {

	private EventRepository repository;
	
	DefaultEventService(EventRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Long count() {
		return this.repository.count();
	}

	@Override
	public List<Event> findAll() {
		return repository.findAll();
	}

	@Override
	public Event findById(Long id) throws EventNotFoundException {
		return repository.findById(id);
	}

}
