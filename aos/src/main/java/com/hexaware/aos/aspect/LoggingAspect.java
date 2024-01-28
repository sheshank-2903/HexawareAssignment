package com.hexaware.aos.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before(" execution(* com.hexaware.aos.service.*.*())")
	public void beforeLogging() {
		System.out.println(" -- log before any bank service ");
	}
	
	@After(" execution(* com.hexaware.aos.service.BankService.fundTransfer())")
	public void afterFundTransferLogging() {
		System.out.println(" -- funds are transfered ");
	}
	
	@Around(" execution(* com.hexaware.aos.service.BankService.deposit())")
	public void afterFundDepositLogging() {
		System.out.println(" -- funds are deposited ");
	}
	
	@Pointcut(" execution(* com.hexaware.aos.service.BankService.checkBalance(..))")
	public void afterReturningBalancePointer() {
		//empty method
	}
	
	@AfterReturning(pointcut="afterReturningBalancePointer()",returning = "balance" )
	public void afterReturningBalance(int balance) {
		System.out.println(balance+ " balance in account ");
	}
	
	@AfterThrowing(pointcut="afterReturningBalancePointer()",throwing = "e")
	public void afterThrowingExcep(Exception e) {
		System.out.println("exception is issued ");
	}
	
	
}
