package events.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import events.domain.Event;
import events.repository.EventRepository;

@Service
@Transactional(readOnly = true)
public class DefaultEventService implements EventService {

	private final EventRepository repository;
	
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
	public List<Event> findAllByState(String state) {
		return repository.findByLocationState(state);
	}
	
	@Override
	public List<Event> findAllByStateAndCity(String state, String city) {
		return repository.findByLocationStateAndLocationCity(state, city);
	}
	
	@Override
	public Event findById(Long id) throws EventNotFoundException {
		return repository.findById(id);
	}
}
