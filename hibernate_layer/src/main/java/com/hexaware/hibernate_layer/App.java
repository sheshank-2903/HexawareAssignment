package com.hexaware.hibernate_layer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.Serializable;

import com.hexaware.hibernate_layer.dao.HealthCareProviderImp;
import com.hexaware.hibernate_layer.dao.IHealthCareProviderDao;
import com.hexaware.hibernate_layer.model.HealthCareProvider;
import com.hexaware.hibernate_layer.util.HibernateUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Normal Insertion using save method
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	boolean result=healthCareProvider.CreateHealthCareProvider(new HealthCareProvider(110,"sheshank","M","jaipur","sheshank@gmail.com"));
//    	System.out.println(result);
    	
    	//NamedQuery for getting HealthCareById
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	HealthCareProvider result=healthCareProvider.selectSingleHealthCareProvider(101);
//    	System.out.println(result);
    	
    	//using sql native query getting all data from HealthCareProvider table
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	System.out.println(healthCareProvider.selectAllHealthCareProvider());
    	
    	//delete by id
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	boolean result=healthCareProvider.deleteHealthCareProvider(103);
//    	System.out.println(result);
    	
    	//delete by name
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	boolean result=healthCareProvider.deleteHealthCareProvider("sheshank");
//    	System.out.println(result);
    	
    	//update
//    	IHealthCareProviderDao healthCareProvider=new HealthCareProviderImp();
//    	boolean result=healthCareProvider.updateHealthCareProvider(new HealthCareProvider(105,"sheshank","M","jaipur","sheshank@gmail.com"));
//    	System.out.println(result);
    	
    }
}
