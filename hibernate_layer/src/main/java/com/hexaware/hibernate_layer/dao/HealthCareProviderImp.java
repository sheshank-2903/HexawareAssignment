package com.hexaware.hibernate_layer.dao;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate_layer.model.HealthCareProvider;
import com.hexaware.hibernate_layer.util.HibernateUtil;


public class HealthCareProviderImp implements IHealthCareProviderDao {
	SessionFactory sessionFactory;
    
	public boolean CreateHealthCareProvider(HealthCareProvider provider) {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction(); // transaction started
	    Serializable serializable=session.save(provider); 
	    System.out.println(serializable.toString());
	    transaction.commit();
		return serializable.toString()!=null;
	}

	public boolean updateHealthCareProvider(HealthCareProvider provider) {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
	    session.saveOrUpdate(provider);
	    transaction.commit();
		return true;
	}

	public boolean deleteHealthCareProvider(int providerId) {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Query query=session.createNamedQuery("deleteHealthProviderById");
    	query.setParameter("Id", providerId);
//    	HealthCareProvider emp=(HealthCareProvider) query.getSingleResult();
    	int rowsAffected = query.executeUpdate();
    	transaction.commit();
    	return rowsAffected>0;
	}
	public boolean deleteHealthCareProvider(String providerName) {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Query query=session.createNamedQuery("deleteHealthProviderByName");
    	query.setParameter("name", providerName);
//    	HealthCareProvider emp=(HealthCareProvider) query.getSingleResult();
    	int rowsAffected = query.executeUpdate();
    	transaction.commit();
    	return rowsAffected>0;
	}

	public HealthCareProvider selectSingleHealthCareProvider(int providerId) {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Query query=session.createNamedQuery("getHealthProviderById");
    	query.setParameter("hid", providerId);
    	HealthCareProvider emp=(HealthCareProvider) query.getSingleResult();
    	transaction.commit();
    	return emp;
	}

	public List<HealthCareProvider> selectAllHealthCareProvider() {
		sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		String nativeQuery="select * from healthcareprovider e ";
    	NativeQuery nativeQueryObj=session.createNativeQuery(nativeQuery,HealthCareProvider.class);
    	List<HealthCareProvider> nativeList=nativeQueryObj.list();
    	transaction.commit();
		return nativeList;
	}
	
	

}
