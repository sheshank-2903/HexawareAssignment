package com.hexaware.hibernate_layer.service;
import com.hexaware.hibernate_layer.model.HealthCareProvider;
import java.util.List;

public interface IHealthCareProviderService {
	
	public boolean CreateHealthCareProvider(HealthCareProvider product);
	
	public boolean updateHealthCareProvider(HealthCareProvider product);
	
	public boolean deleteHealthCareProvider(int productId);
	
	public boolean deleteHealthCareProvider(String providerId);
	
	public HealthCareProvider selectSingleHealthCareProvider(int productId);
	
	public List<HealthCareProvider> selectAllHealthCareProvider();
	
	
}
