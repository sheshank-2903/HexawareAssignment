package com.hexaware.springrestassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestassignment.entities.HealthCareProvider;
import com.hexaware.springrestassignment.service.IHealthCareProviderService;


@RestController
@RequestMapping("/api/healthcareprovider")
public class HealthCareProviderController {
	@Autowired
	IHealthCareProviderService service;
	
	@PostMapping("/add")
	public HealthCareProvider add(@RequestBody HealthCareProvider healthCareProvider) {
		return service.addHealthCareProvider(healthCareProvider);
	}
	
	@PutMapping("/update")
	public HealthCareProvider update(@RequestBody HealthCareProvider healthCareProvider) {
		return service.updateHealthCareProvider(healthCareProvider);
	}
	
	@DeleteMapping("/delete/{healthCareId}")
	public String delete(@PathVariable int healthCareId) {
		return service.deleteHealthCareProvider(healthCareId);
	}
	
	@GetMapping("/getbyid/{helthCareId}")
	public HealthCareProvider getById(@PathVariable int healthCareId) {
		return service.getHealthCareProviderByhealthCareId(healthCareId);
	}
	
	@GetMapping("/getAll")
	public List<HealthCareProvider> getAll(){
		return service.allHealthCareProvider();
	}
	
	@GetMapping("/getByEmail/{email}")
	public List<HealthCareProvider> getByEmail(@PathVariable String email){
		return service.getbyemail(email);
	}
	
	@GetMapping("/getAllMale")
	public List<HealthCareProvider> getMale(){
		return service.getAllMale();
	}
	
	
}
