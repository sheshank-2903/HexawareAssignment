package com.hexaware.sprintjdbc_example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc_example.config.AppConfig;
import com.hexaware.springjdbc_example.model.HealthCareProvider;
import com.hexaware.springjdbc_example.service.IHealthCareProviderService;
import com.hexaware.springjdbc_example.service.HealthCareProviderServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext context=	new AnnotationConfigApplicationContext(AppConfig.class);
		IHealthCareProviderService service=context.getBean(HealthCareProviderServiceImp.class);
		boolean flag = true;
		while (flag) {
			System.out.println("****WELCOME DMS ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				boolean result= service.CreateHealthCareProvider(new HealthCareProvider(101,"data","M","abc","abc@gmail.com"));
				System.out.println( " record entry status : "+result);

				break;

			case 2:
				boolean updateResult= service.updateHealthCareProvider(new HealthCareProvider(101,"data","F","abc","abc@gmail.com"));
				System.out.println( " record update status : "+updateResult);
				break;

			case 3:
				boolean deleteResult= service.deleteHealthCareProvider(101);
				System.out.println( " record delete status : " +deleteResult);
				break;

			case 4:
				HealthCareProvider product=service.selectSingleHealthCareProvider(101);
				System.out.println(product);
				break;
			case 5:
				List<HealthCareProvider> ll=service.selectAllHealthCareProvider();
				System.out.println(ll);
				break;

			case 6:
				flag=false;
				break;

			default:
				break;
			}
		}
	}
}
