package events.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Entity
@Table(name = "events")
@Data
@EqualsAndHashCode(exclude = "id")
public class Event implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Setter(AccessLevel.PRIVATE)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "event_start_date", nullable = false) 
	private LocalDateTime eventStartDate = LocalDateTime.now();
	
	@Column(name = "event_end_date") 
	private LocalDateTime eventEndDate = LocalDateTime.now();
	
	@Column(name = "event_image", nullable = false)
	private String eventImage;
	
	@Column(name = "description", columnDefinition = "TEXT NOT NULL")
	private String description;
	
	@OneToOne
	private Location location;
	
	@Column(name = "rate")
	private Integer rate;
	
		
	public Event() {
//		required by JPA
	}

	public Event(Long id, String name, LocalDateTime eventStartDate, String eventImage, String description,
			Location location) {
		this.id = id;
		this.name = name;
		this.eventStartDate = eventStartDate;
		this.eventImage = eventImage;
		this.description = description;
		this.location = location;
	}

	public Event(Long id, String name, LocalDateTime eventStartDate, LocalDateTime eventEndDate, String eventImage,
			String description, Location location) {
		this(id, name, eventStartDate, eventImage, description, location);
		this.eventEndDate = eventEndDate;
	}
	
	public Event(Long id, String name, LocalDateTime eventStartDate, String eventImage,
			String description, Location location, Integer rate) {
		this(id, name, eventStartDate, eventImage, description, location);
		this.rate = rate;
	}
	
	public Event(Long id, String name, LocalDateTime eventStartDate, LocalDateTime eventEndDate, String eventImage,
			String description, Location location, Integer rate) {
		this(id, name, eventStartDate, eventImage, description, location);
		this.eventEndDate = eventEndDate;
		this.rate = rate;
	}
	
}
