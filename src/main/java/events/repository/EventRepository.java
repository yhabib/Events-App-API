package events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import events.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	
	Event findById(Long id);	
}