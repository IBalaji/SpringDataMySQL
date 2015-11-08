package data.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="city_id",nullable = false, unique = true)
	private long cityId;
	
	@Column(name="city_name",nullable = false, unique = true)
	private String cityName;

	@ManyToOne
	@JoinColumn(name="state_id")
	private State state;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}