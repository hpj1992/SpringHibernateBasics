package com.hibernate.DAOImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.Address;
import com.hibernate.Employee;

public class EmployeeDAOImpl {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);
		session.close();
	}
	public Employee getEmployee(int id){
		Session session=sessionFactory.openSession();
		Employee toReturn= (Employee) session.get(Employee.class,id);
		Address address=toReturn.getAddress();
		System.out.println(address.getCity());
		//session.close();
		return toReturn;
		
	}
}
