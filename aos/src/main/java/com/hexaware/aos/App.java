package com.hexaware.aos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aos.config.AppConfig;
import com.hexaware.aos.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	BankService service=context.getBean(BankService.class);
//    	service.deposit();
//    	service.withdraw();
//    	service.fundTransfer();
    	service.checkBalance(0);
    	
    	
//    	BankService bs=new BankService();
        //System.out.println( bs.withdraw() );
//    	bs.withdraw();
    }
}
