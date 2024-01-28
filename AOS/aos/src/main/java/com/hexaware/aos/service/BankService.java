package com.hexaware.aos.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	public void deposit() {
		System.out.println("deposited");
	}
	
	public void withdraw() {
		System.out.println("withdraw");
	}
	
	public void fundTransfer() {
		System.out.println("fund Transfer");
	}
	
	public int checkBalance(int acno) throws Exception {
		int bal=5000;
		
		if(acno>0)
			bal = 100; 
		else 
			throw new Exception();
		return bal;
	}
}
