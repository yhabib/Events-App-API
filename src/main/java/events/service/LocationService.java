package events.service;

import java.util.List;

public interface LocationService {
	
	List<String> getAllStates();
	
	List<String> getAllCities(String state);
	
}
