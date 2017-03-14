package events;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class EventsRestApi {

//	@Bean
//	public DataSource dataSource() {
//	  String url = "jdbc:h2:tcp://localhost/~/h2-events-app";
//	  return new DriverManagerDataSource(url);
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//	    return new JdbcTemplate(dataSource());
//	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EventsRestApi.class, args);
	}

}
