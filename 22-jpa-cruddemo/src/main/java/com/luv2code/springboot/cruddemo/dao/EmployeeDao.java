package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeDao {

	public List<Employee> findAll(); 
	public Employee findById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
}
