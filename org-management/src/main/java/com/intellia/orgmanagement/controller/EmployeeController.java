package com.intellia.orgmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intellia.orgmanagement.entity.Department;
import com.intellia.orgmanagement.entity.Employee;
import com.intellia.orgmanagement.service.EmployeeService;

import io.swagger.annotations.Api;

@RestController
@Api
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getbycity")
	public ResponseEntity<Object> getAllEmployeeByCity(@RequestParam String city)
	{
		return employeeService.getAllEmployeeByCity(city);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	@PostMapping("/getAllEmployeeByDepartment")
	public ResponseEntity<Object> getAllEmployeeByDepartment(@RequestBody Department department)
	{
		return employeeService.getAllEmployeeByDepartment(department);
	}
	
	@PostMapping("/deleteAllEmployeeByDepartment")
	public ResponseEntity<Object> deleteAllEmployeeByDepartment(@RequestBody Department department)
	{
		return employeeService.deleteAllEmployeeByDepartment(department);
	}
}
