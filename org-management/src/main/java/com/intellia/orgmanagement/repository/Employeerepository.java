package com.intellia.orgmanagement.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.intellia.orgmanagement.entity.Department;
import com.intellia.orgmanagement.entity.Employee;

public interface Employeerepository extends JpaRepository<Employee, Integer> {

	@Query("from Employee e where e.city=:city")
	public List<Employee> getAllEmployeeByCity(String city);

	@Query("from Employee e where e.department=:department")
	public List<Employee> getAllEmployeeByDepartment(Department department);

	@Transactional
	@Modifying
	@Query("delete from Employee e where e.department=:department")
	public int deleteAllEmployeeByDepartment(Department department);

}
