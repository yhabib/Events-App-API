package events.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import events.AbstractAppIntegrationTest;

public class EventServiceTest extends AbstractAppIntegrationTest {

	private final static int NUM_EVENTS_IN_TEST = 4;
	
	@Autowired
	EventService service;
	
	@Test
	public void count() {
		assertThat(service.count()).isEqualTo(NUM_EVENTS_IN_TEST);
	}

}
