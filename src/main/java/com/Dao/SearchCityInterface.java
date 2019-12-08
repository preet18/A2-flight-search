package com.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.City;

@Repository
public interface SearchCityInterface extends JpaRepository<City, Integer>{

	public List<City> findAll();
}
