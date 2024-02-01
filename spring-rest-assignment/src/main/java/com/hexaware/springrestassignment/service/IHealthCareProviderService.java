package com.hexaware.springrestassignment.service;

import java.util.List;

import com.hexaware.springrestassignment.entities.HealthCareProvider;

public interface IHealthCareProviderService {
	public HealthCareProvider addHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public String deleteHealthCareProvider(int healthId);
	
	public List<HealthCareProvider> allHealthCareProvider();
	
	public HealthCareProvider updateHealthCareProvider(HealthCareProvider healthCareProvider);
	
	public HealthCareProvider getHealthCareProviderByhealthCareId(int healthCareId);
	
	public List<HealthCareProvider> getbyemail(String email);
	
	public List<HealthCareProvider> getAllMale();
}
