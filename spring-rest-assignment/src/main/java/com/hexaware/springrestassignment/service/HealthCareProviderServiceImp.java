package com.hexaware.springrestassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestassignment.entities.HealthCareProvider;
import com.hexaware.springrestassignment.repository.HealthCareRepository;

@Service
public class HealthCareProviderServiceImp implements IHealthCareProviderService {
	
	@Autowired
	HealthCareRepository repo;
	
	@Override
	public HealthCareProvider addHealthCareProvider(HealthCareProvider healthCareProvider) {
		// TODO Auto-generated method stub
		return repo.save(healthCareProvider);
	}

	@Override
	public String deleteHealthCareProvider(int healthId) {
		// TODO Auto-generated method stub
		repo.deleteById(healthId);
		return " delete done";
	}

	@Override
	public List<HealthCareProvider> allHealthCareProvider() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public HealthCareProvider updateHealthCareProvider(HealthCareProvider healthCareProvider) {
		// TODO Auto-generated method stub
		return repo.save(healthCareProvider);
	}

	@Override
	public HealthCareProvider getHealthCareProviderByhealthCareId(int healthCareId) {
		// TODO Auto-generated method stub
		return repo.findById(healthCareId).orElse(null);
	}

	@Override
	public List<HealthCareProvider> getbyemail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	@Override
	public List<HealthCareProvider> getAllMale() {
		// TODO Auto-generated method stub
		return repo.findMaleProviders();
	}

}
