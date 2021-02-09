package com.hibernate.start.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "employee_details")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String designation;
	
	@Transient
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDesignation() {
		return designation;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address + "]";
	}

}
