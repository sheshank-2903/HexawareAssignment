package com.hexaware.springjdbc_example.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc_example.model.HealthCareProvider;

@Service
public class HealthCareProviderImp implements IHealthCareProviderDao {
	
	JdbcTemplate jdbcTemplate;
	
	public HealthCareProviderImp(DataSource dataSource) {
		jdbcTemplate=new JdbcTemplate(dataSource);
		System.out.println(jdbcTemplate);
		
	}

	public boolean CreateHealthCareProvider(HealthCareProvider product) {
		String insertQuery = "insert into health_care_provider(health_care_id,healthcare_provider_name,provider_gender,address,email) values(?,?,?,?,?)";
		int count = jdbcTemplate.update(insertQuery,product.getHealthCareId(),product.getHealthcareProviderName(),product.getProviderGender(),product.getAddress(),product.getEmail());
		return count>0;
	}

	public boolean updateHealthCareProvider(HealthCareProvider product) {
		String updateQuery = "update health_care_provider set healthcare_provider_name=?,provider_gender=?,address=?,email=? where health_care_id=?";
		int count = jdbcTemplate.update(updateQuery,product.getHealthcareProviderName(),product.getProviderGender(),product.getAddress(),product.getEmail(),product.getHealthCareId());
		return count>0;
	}

	public boolean deleteHealthCareProvider(int productId) {
		String deleteQuery = "delete from health_care_provider where health_care_id=?";
		int count = jdbcTemplate.update(deleteQuery,productId);
		return count>0;
	}

	public HealthCareProvider selectSingleHealthCareProvider(int productId) {
		String selectSingleP = "select health_care_id,healthcare_provider_name,provider_gender,address,email from health_care_provider where health_care_id=?";
		HealthCareProvider product=jdbcTemplate.queryForObject(selectSingleP,new ProductMapper(),productId);
		return product;
	}

	public List<HealthCareProvider> selectAllHealthCareProvider() {
		String selectAllProduct = "select health_care_id,healthcare_provider_name,provider_gender,address,email from health_care_provider";
		List<HealthCareProvider> ll=jdbcTemplate.query(selectAllProduct,new ProductMapper());
		return ll;
	}

}
