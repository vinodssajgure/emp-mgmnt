package com.example.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String emailId;
	private String phoneNumber;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String emailId, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
