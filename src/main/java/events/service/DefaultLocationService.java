package events.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import events.domain.Location;
import events.repository.LocationRepository;


@Service
@Transactional(readOnly = true)
public class DefaultLocationService implements LocationService {

	private final LocationRepository repository;
	
	public DefaultLocationService(LocationRepository locationRepository) {
		this.repository = locationRepository;
	}
	
	@Override
	public List<String> getAllStates() {
		return repository
				.findAll()
				.stream()
				.map(Location::getState)
				.collect(toList());
	}

	@Override
	public List<String> getAllCities(String state) {
		return repository
				.findAllByState(state)
				.stream()
				.map(Location::getCity)
				.collect(toList());
	}

}
