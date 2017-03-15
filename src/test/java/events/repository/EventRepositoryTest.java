package events.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class EventRepositoryTest {

	private static final int NUM_TEST_EVENTS = 4;
	
	@Autowired
	EventRepository repository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	public void count() {
		assertThat(repository.count()).isEqualTo(NUM_TEST_EVENTS);
	}

	
}
