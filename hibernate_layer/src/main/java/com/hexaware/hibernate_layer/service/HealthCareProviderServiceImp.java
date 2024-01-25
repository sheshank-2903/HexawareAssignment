package com.hexaware.hibernate_layer.service;
import com.hexaware.hibernate_layer.model.HealthCareProvider;
import java.util.List;
import com.hexaware.hibernate_layer.dao.*;

public class HealthCareProviderServiceImp implements IHealthCareProviderService{
	
	IHealthCareProviderDao dao;
	public boolean CreateHealthCareProvider(HealthCareProvider product) {
		// TODO Auto-generated method stub
		return dao.CreateHealthCareProvider(product);
	}

	public boolean updateHealthCareProvider(HealthCareProvider product) {
		// TODO Auto-generated method stub
		return dao.updateHealthCareProvider(product);
	}

	public boolean deleteHealthCareProvider(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteHealthCareProvider(productId);
	}
	
	public boolean deleteHealthCareProvider(String productId) {
		// TODO Auto-generated method stub
		return dao.deleteHealthCareProvider(productId);
	}
	
	

	public HealthCareProvider selectSingleHealthCareProvider(int productId) {
		// TODO Auto-generated method stub
		return dao.selectSingleHealthCareProvider(productId);
	}

	public List<HealthCareProvider> selectAllHealthCareProvider() {
		// TODO Auto-generated method stub
		return dao.selectAllHealthCareProvider();
	}

}
