package events.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Data
@EqualsAndHashCode(exclude = "id")
public class Location implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  // no need of it
	@Setter(AccessLevel.PRIVATE)
	private Long id;
	
	@Column(name = "country", nullable = false, length = 50)
	private String country;
	
	@Column(name = "state", nullable = false, length = 50)
	private String state;
	
	@Column(name = "city", nullable = false, length = 50)
	private String city;
	
	@Column(name = "post_code", nullable = false)
	private Integer postCode;
	
	@Column(name = "street", nullable = false, length = 100)
	private String street;
	
	@Column(name = "number", nullable = false)
	private Integer number;
	
	protected Location() {
	}

	public Location(String country, String state, String city, Integer postCode, String street, Integer number) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.postCode = postCode;
		this.street = street;
		this.number = number;
	}
	
}
