package events.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import events.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	List<Location> findAllByState(String state);
}
