package com.example.service;

import java.util.List;

import com.example.entitiy.Employee;


public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	 
	public Employee getEmployee(int id);
	 
	public List<Employee> fetchEmployeeList();
	 
	public Employee update(Employee employee);
	 
	public void deleteEmployeeById(int id);
}
