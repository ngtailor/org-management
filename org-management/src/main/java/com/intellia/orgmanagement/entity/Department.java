package com.intellia.orgmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "d_id")
	private int id;
	@Column(name = "department_name")
	private String departmentName;
	
	@OneToMany(mappedBy="department")
	@JsonIgnore
	private List<Employee> employee=new ArrayList<Employee>();
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department(int id, String departmentName, List<Employee> employee) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", employee=" + employee + "]";
	}
	
}
