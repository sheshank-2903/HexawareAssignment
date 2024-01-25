package com.hexaware.springjdbc_example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc_example.model.HealthCareProvider;

public class ProductMapper implements RowMapper {

	public HealthCareProvider mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		HealthCareProvider product=new HealthCareProvider(rs.getInt("health_care_id"),
															rs.getString("healthcare_provider_name"),
															rs.getString("provider_gender"),
															rs.getString("address"),
															rs.getString("email"));
		return product;
	}

}
