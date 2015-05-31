package com.hibernate.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.Address;

public class AddressDAOImpl {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(Address address){
		Session session=sessionFactory.openSession();
		session.save(address);
		session.close();
	}
}
