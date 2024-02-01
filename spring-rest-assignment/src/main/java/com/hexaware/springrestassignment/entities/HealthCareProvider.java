package com.hexaware.springrestassignment.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class HealthCareProvider {
	@Id
	@NotNull
	@Min(999)
	private int healthCareId;
	@NotBlank
	private String healthcareProviderName;
    private String providerGender;
    private String address;
    
    @Email
    private String email;
	public HealthCareProvider() {
		super();
	}
	public HealthCareProvider(int healthCareId, String healthcareProviderName, String providerGender, String address,
			String email) {
		super();
		this.healthCareId = healthCareId;
		this.healthcareProviderName = healthcareProviderName;
		this.providerGender = providerGender;
		this.address = address;
		this.email = email;
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
	public String getProviderGender() {
		return providerGender;
	}
	public void setProviderGender(String providerGender) {
		this.providerGender = providerGender;
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
	@Override
	public String toString() {
		return "HealthCareProvider [healthCareId=" + healthCareId + ", healthcareProviderName=" + healthcareProviderName
				+ ", providerGender=" + providerGender + ", address=" + address + ", email=" + email + "]";
	}
    
    
}
