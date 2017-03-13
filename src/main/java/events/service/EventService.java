package events.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import events.domain.Event;

@Service
@Transactional(readOnly = true)
public interface EventService {
	
	Long count();
	
	List<Event> findAll();

	Event findById(Long id) throws EventNotFoundException;
}
