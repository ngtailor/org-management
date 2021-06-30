package com.intellia.orgmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellia.orgmanagement.repository.Departmentrepository;

@Service
public class DepartmentService {
	
	@Autowired
	private Departmentrepository departmentrepository;

}
