package com.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class SearchFlight {

	private String fromLocation;
	
	private String toLocation;

	private Date departureDate;
	
	private Date arrivalDate;
	
	private Timestamp depatureTiming;
	
	private Timestamp arrivalTiming;
	
	private int capacity;
	
	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Timestamp getDepatureTiming() {
		return depatureTiming;
	}

	public void setDepatureTiming(Timestamp depatureTiming) {
		this.depatureTiming = depatureTiming;
	}

	public Timestamp getArrivalTiming() {
		return arrivalTiming;
	}

	public void setArrivalTiming(Timestamp arrivalTiming) {
		this.arrivalTiming = arrivalTiming;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
	
	
}
