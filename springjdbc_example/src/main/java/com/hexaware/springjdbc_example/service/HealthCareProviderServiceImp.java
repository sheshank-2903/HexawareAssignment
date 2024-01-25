package com.hexaware.springjdbc_example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc_example.dao.IHealthCareProviderDao;
import com.hexaware.springjdbc_example.model.HealthCareProvider;

@Repository
public class HealthCareProviderServiceImp implements IHealthCareProviderService{

	@Autowired
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

	public HealthCareProvider selectSingleHealthCareProvider(int productId) {
		// TODO Auto-generated method stub
		return dao.selectSingleHealthCareProvider(productId);
	}

	public List<HealthCareProvider> selectAllHealthCareProvider() {
		// TODO Auto-generated method stub
		return dao.selectAllHealthCareProvider();
	}

}
