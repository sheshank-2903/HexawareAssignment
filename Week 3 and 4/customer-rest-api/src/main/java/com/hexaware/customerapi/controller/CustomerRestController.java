package com.hexaware.customerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.service.ICustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

	@Autowired
	ICustomerService service;
	
	@PostMapping("/add")
	public Customer	addCustomer(@RequestBody CustomerDTO customerDTO) {
		
		return service.addCustomer(customerDTO);
	}

	
	@GetMapping("/get/{customerId}")
	public CustomerDTO	getCustomerById(@PathVariable int customerId) {
		
		return service.getCustomerById(customerId);
	}

	
	@GetMapping("/getall")
	public List<Customer>	getAllCustomer(){
		
		return service.getAllCustomer();
	}

	@GetMapping("/customer-product/{customerId}")
	public CustomerProductVO getCustomerAndProductById(@PathVariable int customerId) {
		
		return service.getCustomerAndProductById(customerId);
	}
	
	@DeleteMapping("/delete/productbycustomerid/{customerId}")
	public String deleteCustomerAndProductById (@PathVariable int customerId) {
		return service.deleteProductByCustomerId(customerId);
	}
}
