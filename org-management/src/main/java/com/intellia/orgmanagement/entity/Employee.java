package com.intellia.orgmanagement.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "e_id")
	private int id;
	private String name;
	private double salary;
	private String mail;
	private String city;
	private Byte[] photo;
	
	@ManyToOne
	private Department department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int id, String name, double salary, String mail, String city, Byte[] photo, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mail = mail;
		this.city = city;
		this.photo = photo;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mail=" + mail + ", city=" + city
				+ ", photo=" + Arrays.toString(photo) + ", department=" + department + "]";
	}

	
	

}
