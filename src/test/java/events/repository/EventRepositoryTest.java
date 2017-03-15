package events.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import events.domain.Event;

public class EventRepositoryTest extends AbstractAppIntegrationTest {

	private static final int NUM_TEST_EVENTS = 4;
	
	@Autowired
	EventRepository repository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	public void count() {
		assertThat(repository.count()).isEqualTo(NUM_TEST_EVENTS);
	}
	
	@Test
	public void findById() {
		List<Event> events = repository.findAll();
		Event event = repository.findById(1L);
		assertThat(event).isEqualTo(events.get(0));
	}

	@Test
	public void findByLocationState() {
		String state = "Genève";
		List<Event> events = repository.findAll();
		List<Event> eventsFiltered = repository.findByLocationState(state);
		assertThat(events).containsAll(eventsFiltered);
		assertThat(eventsFiltered.size()).isEqualTo(2);
	}
	
	@Test
	public void findByLocationStateAndLocationCity() {
		String state = "Genève";
		String city = "Genf";
		List<Event> events = repository.findAll();
		List<Event> eventsFiltered = repository.findByLocationStateAndLocationCity(state, city);
		assertThat(events).containsAll(eventsFiltered);
		assertThat(eventsFiltered.size()).isEqualTo(1);
	}
	
}
