package com.ibernate.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.Address;
import com.hibernate.Employee;
import com.hibernate.Sponsor;
import com.hibernate.DAOImpl.AddressDAOImpl;
import com.hibernate.DAOImpl.EmployeeDAOImpl;
import com.hibernate.DAOImpl.SponsorDAOImpl;

public class Main {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        AddressDAOImpl addressDAOImpl = context.getBean(AddressDAOImpl.class);
        SponsorDAOImpl sponsorDAOImpl=  context.getBean(SponsorDAOImpl.class);
        EmployeeDAOImpl employeeDAOImpl=context.getBean(EmployeeDAOImpl.class);
        
        Address address = new Address();
        address.setCity("vadodara");
        address.setStreet("baroda");
        address.setId(5);
        address.setCountry("india");
        address.setZipcode("95112");
        
       Sponsor sponsor=new Sponsor();
       sponsor.setAddress(2);
       sponsor.setDescription("");
       sponsor.setEmail("hpj@hpj.com");
       sponsor.setName("harshit is sponsor");
        
       Employee emp=new Employee();
       emp.setId(10);
       emp.setName("harshit");
       emp.setSalary(30000000000.00);
       emp.setSsn("123456789");
       emp.setAddress_id(2);
       
       /* addressDAOImpl.save(address);
        sponsorDAOImpl.save(sponsor);
*/       /// employeeDAOImpl.save(emp);
       Employee empl=(Employee)employeeDAOImpl.getEmployee(3);
       System.out.println(empl.getName());
       
	}
}
