package events.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import events.AbstractAppIntegrationTest;
import events.domain.Location;

public class LocationRepositoryTest extends AbstractAppIntegrationTest {

	private static final int NUM_TEST_LOCATIONS = 4;
	
	@Autowired
	LocationRepository repository;
	
	@Test
	public void count() {
		assertThat(repository.count()).isEqualTo(NUM_TEST_LOCATIONS);
	}
	
	@Test
	public void findAllByState() {
		String state = "Zurich";
		List<Location> locations = repository.findAll();
		List<Location> locationsFiltered = repository.findAllByState(state);
		System.out.println(locations);
		
		assertThat(locations).containsAll(locationsFiltered);
		assertThat(locationsFiltered.size()).isEqualTo(2);
	}

}
