package events.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import events.AbstractAppIntegrationTest;


public class LoacationServiceTest extends AbstractAppIntegrationTest {
	
	@Autowired
	LocationService service;
		
	@Test
	public void getAllStates() {
		List<String> statesInDataTest = Arrays.asList("Genève", "Zurich");
		
		assertThat(service.getAllStates()).containsAll(statesInDataTest);
	}
	
	@Test
	public void getAllCitiesGivenAState() {
		List<String> citiesForAState = Arrays.asList("Genève", "Genf");
		
		assertThat(service.getAllCities("Genève")).containsAll(citiesForAState);
	}
	
}
