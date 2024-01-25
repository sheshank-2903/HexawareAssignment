package com.hexaware.springjdbc_example.dao;

import java.util.List;

import com.hexaware.springjdbc_example.model.HealthCareProvider;

public interface IHealthCareProviderDao {
	
	public boolean CreateHealthCareProvider(HealthCareProvider provider);
	
	public boolean updateHealthCareProvider(HealthCareProvider provider);
	
	public boolean deleteHealthCareProvider(int providerId);
	
	public HealthCareProvider selectSingleHealthCareProvider(int providerId);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();
}
