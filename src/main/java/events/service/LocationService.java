package events.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public interface LocationService {
	
	List<String> getAllStates();
	
	List<String> getAllCities(String state);
	
}
