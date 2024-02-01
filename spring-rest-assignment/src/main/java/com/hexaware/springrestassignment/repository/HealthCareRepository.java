package com.hexaware.springrestassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.springrestassignment.entities.HealthCareProvider;

public interface HealthCareRepository extends JpaRepository<HealthCareProvider,Integer>{
	public List<HealthCareProvider> findByEmail(String email);
	
	@Query("select h from HealthCareProvider h where providerGender='male'")
	public List<HealthCareProvider> findMaleProviders();
}
