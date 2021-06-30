package com.intellia.orgmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intellia.orgmanagement.entity.Department;
import com.intellia.orgmanagement.entity.Employee;
import com.intellia.orgmanagement.repository.Employeerepository;

@Service
public class EmployeeService {
	@Autowired
	private Employeerepository employeerepository;

	public ResponseEntity<Object> getAllEmployeeByCity(String city) {
		return new ResponseEntity<Object>(employeerepository.getAllEmployeeByCity(city),HttpStatus.OK);
	}

	public ResponseEntity<Object> createEmployee(Employee employee) {
		return new ResponseEntity<Object>(employeerepository.save(employee),HttpStatus.OK);
	}

	public ResponseEntity<Object> getAllEmployeeByDepartment(Department department) {
		return new ResponseEntity<Object>(employeerepository.getAllEmployeeByDepartment(department),HttpStatus.OK);
	}

	public ResponseEntity<Object> deleteAllEmployeeByDepartment(Department department) {
		return new ResponseEntity<Object>(employeerepository.deleteAllEmployeeByDepartment(department),HttpStatus.OK);
	}

}
