package com.hexaware.hibernate_layer.dao;

import com.hexaware.hibernate_layer.model.HealthCareProvider;
import java.util.List;

public interface IHealthCareProviderDao {
	
	public boolean CreateHealthCareProvider(HealthCareProvider provider);
	
	public boolean updateHealthCareProvider(HealthCareProvider provider);
	
	public boolean deleteHealthCareProvider(int providerId);
	
	public boolean deleteHealthCareProvider(String providerId);
	
	public HealthCareProvider selectSingleHealthCareProvider(int providerId);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();
}
