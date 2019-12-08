package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.SearchFlightService;
import com.dto.SearchFlight;

@RestController
public class SearchFlightController {

	@Autowired 
	SearchFlightService searchFlightService;
	
	@RequestMapping("/searchFlightFromToLocation")
	public Map<String, Object> searchFlightFromToLocation(@RequestBody SearchFlight searchFlight){
		return searchFlightService.searchFlightFromToLocation(searchFlight);
	}
	
	@RequestMapping("/searchFlightFromToLocationAndDepartureDate")
	public Map<String, Object> searchFlightFromToLocationAndDepartureDate(@RequestBody SearchFlight searchFlight){
		return searchFlightService.searchFlightFromToLocationAndDepartureDate(searchFlight);
	}
	
	@RequestMapping("/getFlightsList")
	public Map<String, Object> getCities(){
		return searchFlightService.getCities();
	}
}
