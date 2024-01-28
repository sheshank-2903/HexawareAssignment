package com.hexaware.mapping_example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping_example.entity.Address;
import com.hexaware.mapping_example.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOne 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        System.out.println(session);
        Address address=new Address(101,"aaa","aaaa");
        Student student =new Student(201,"sss",address);
        Transaction transaction= session.beginTransaction();
        session.persist(student);
        transaction.commit();
        
        
    }
}
