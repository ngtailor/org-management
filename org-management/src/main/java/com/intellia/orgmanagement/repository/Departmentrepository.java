package com.intellia.orgmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intellia.orgmanagement.entity.Department;

public interface Departmentrepository extends JpaRepository<Department, Integer>{

}
