package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CITY")
public class City {
	
	
	@Column(name="CITY_NAME")
	private String cityName;
	
}
