package com.example.demoWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class student {

	private int id;
	private String name;
	private String dept;
	private String email;
	private String contact;
	
	@Id
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public student() {
		super();
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + ", contact=" + contact
				+ "]";
	}

	public student(int id, String name, String dept, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
		this.contact = contact;
	}
	
	

}
