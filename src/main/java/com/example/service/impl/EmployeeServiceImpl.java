package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitiy.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}
	
	public Employee getEmployee(int id) {
		
		return employeeRepository.findById(id).get();
	}


	public List<Employee> fetchEmployeeList() {

		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee update(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	public void deleteEmployeeById(int id) {

		employeeRepository.deleteById(id);

	}

	
	

	
	
	

}
