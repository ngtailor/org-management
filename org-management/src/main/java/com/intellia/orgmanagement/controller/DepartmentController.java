package com.intellia.orgmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellia.orgmanagement.service.DepartmentService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/department")
@Api
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
//	public ResponseEntity<Object> 

}
