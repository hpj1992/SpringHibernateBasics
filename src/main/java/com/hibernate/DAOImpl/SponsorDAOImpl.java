package com.hibernate.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Sponsor;

public class SponsorDAOImpl {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Sponsor sponsor) {
		Session session = sessionFactory.openSession();
		session.save(sponsor);
		session.close();
	}
}
