package com.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String ssn;
	
	@Column
	private Double salary;
	
	@Column
	private int address_id;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Double getSalary() {
		return salary;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	
	public List<Sponsor> getSponsors() {
		return sponsors;
	}

	public void setSponsors(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="address_id",insertable = false, updatable = false)
	private Address address;

	@OneToMany(mappedBy="employee")
	private List<Phone> phones;
	
	@ManyToMany
	@JoinTable(name="employee_sponsor",
	joinColumns={@JoinColumn(name="employee_id",referencedColumnName="id")},
	inverseJoinColumns={@JoinColumn(name="sponsor_id",referencedColumnName="id")})
	private List<Sponsor> sponsors;
			
			
}
