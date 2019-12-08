package com.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.AerothonFlights;

@Repository
public interface SearchFlightInterface extends JpaRepository<AerothonFlights, Integer>{

	/*
	 * public List<AerothonFlights> findAllByFromLocationAndToLocation(String
	 * fromLocation, String toLocation);
	 */
	@Query("SELECT *  FROM AerothonFlights af where FromLocation = ?1 and ToLocation = ?2 and CurrentCapacity > 0")
	public List<AerothonFlights> findAllByFromToLocation(String fromLocation, String toLocation);

	public List<AerothonFlights> findAllByFromToLocationAndDepatureDate(String fromLocation, String toLocation, Date departureDate);
	
	@Query("SELECT *  FROM AerothonFlights af where FromLocation = ?1 and ToLocation <> ?2 and CurrentCapacity > 0")
	public List<AerothonFlights> findAllByFromLocation(String fromLocation, String toLocation);
	
	@Query("SELECT *  FROM AerothonFlights af where FromLocation <> ?1 and ToLocation = ?2 and CurrentCapacity > 0")
	public List<AerothonFlights> findAllByToLocation(String fromLocation, String toLocation);

	public List<AerothonFlights> findallByDepartureDate(Date departureDate);
}
