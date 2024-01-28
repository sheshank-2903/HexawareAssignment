package com.hexaware.mapping_example;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping_example.entity4.Order_Details;
import com.hexaware.mapping_example.entity4.Product;

public class ManyToMany {
	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
	    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	    Session session =sessionFactory.openSession();
	    System.out.println(session);
	    Transaction transaction=session.beginTransaction();
	    
		Product p1=new Product();
		p1.setpId(1);
		p1.setProductName("A");
		
		Product p2=new Product();
		p2.setpId(2);
		p2.setProductName("B");
		
		Product p3=new Product();
		p3.setpId(3);
		p3.setProductName("C");
		
		Order_Details o1=new Order_Details();
		o1.setOrderId(100);
		o1.setPurchaseDate(LocalDate.now());
		o1.addProduct(p1);
		o1.addProduct(p2);
		o1.addProduct(p3);
		
		
		
		Order_Details o2=new Order_Details();
		o2.setOrderId(110);
		o2.setPurchaseDate(LocalDate.now());
		o2.addProduct(p3);
		o2.addProduct(p2);
		
		
		
		Order_Details o3=new Order_Details();
		o3.setOrderId(120);
		o3.setPurchaseDate(LocalDate.now());
		o3.addProduct(p1);
		
		session.persist(o1);
		session.persist(o2);
		session.persist(o3);
		
		
		p2.addOrder(o1);
		session.persist(p2);
		
	    transaction.commit();
	    session.close();
	    
	   
		
	}
}	
