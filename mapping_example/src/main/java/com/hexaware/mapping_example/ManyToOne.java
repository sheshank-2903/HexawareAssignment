package com.hexaware.mapping_example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping_example.entity3.Department;
import com.hexaware.mapping_example.entity3.Employees;

public class ManyToOne {
	public static void main(String []args) {
		System.out.println( "Hello World!" );
	    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	    Session session =sessionFactory.openSession();
	    System.out.println(session);
	    Transaction transaction=session.beginTransaction();
	    Employees e1=new Employees(101,"a",2000);
	    Employees e2=new Employees(102,"b",2300);
	    Employees e3=new Employees(103,"c",2400);
	    Employees e4=new Employees(104,"d",2500);
	    Employees e5=new Employees(105,"e",2600);
	    
	    Department d1=new Department();
	    d1.setdId(2);
	    d1.setDname("Data");
	    d1.addEmployees(e1);
	    d1.addEmployees(e2);
	    d1.addEmployees(e3);
	    d1.addEmployees(e4);
	    d1.addEmployees(e5);
	    
	    session.persist(d1);
	    transaction.commit();
	} 
}
