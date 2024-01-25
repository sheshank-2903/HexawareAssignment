package com.hexaware.springjdbc_example.service;

import java.util.List;

import com.hexaware.springjdbc_example.model.HealthCareProvider;

public interface IHealthCareProviderService {
	
	public boolean CreateHealthCareProvider(HealthCareProvider product);
	
	public boolean updateHealthCareProvider(HealthCareProvider product);
	
	public boolean deleteHealthCareProvider(int productId);
	
	public HealthCareProvider selectSingleHealthCareProvider(int productId);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();
	
	
}
