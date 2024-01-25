package com.hexaware.springjdbc_example.model;

public class HealthCareProvider {
	private int healthCareId;
	private String healthcareProviderName,address,email;
	private String providerGender;
	public HealthCareProvider() {
		super();
	}
	public HealthCareProvider(int healthCareId, String healthcareProviderName, String providerGender,String address, String email) {
		super();
		this.healthCareId = healthCareId;
		this.healthcareProviderName = healthcareProviderName;
		this.address = address;
		this.email = email;
		this.providerGender = providerGender;
	}
	public int getHealthCareId() {
		return healthCareId;
	}
	public void setHealthCareId(int healthCareId) {
		this.healthCareId = healthCareId;
	}
	public String getHealthcareProviderName() {
		return healthcareProviderName;
	}
	public void setHealthcareProviderName(String healthcareProviderName) {
		this.healthcareProviderName = healthcareProviderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProviderGender() {
		return providerGender;
	}
	public void setProviderGender(String providerGender) {
		this.providerGender = providerGender;
	}
	@Override
	public String toString() {
		return "HealthCareProvider [healthCareId=" + healthCareId + ", healthcareProviderName=" + healthcareProviderName
				+ ", address=" + address + ", email=" + email + ", providerGender=" + providerGender + "]";
	}
	
	
}
