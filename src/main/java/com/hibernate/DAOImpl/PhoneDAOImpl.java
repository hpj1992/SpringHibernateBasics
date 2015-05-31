package com.hibernate.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Phone;

public class PhoneDAOImpl {

	private SessionFactory sessionFactory;
	
	public void save(Phone phone){
		Session session=(Session)sessionFactory.openSession();
		session.save(phone);
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
