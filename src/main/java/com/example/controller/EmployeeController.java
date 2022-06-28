package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitiy.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// get list of all employees

	@GetMapping()
	public List<Employee> fetchEmployeeList() {
		return employeeService.fetchEmployeeList();

	}

	// add employee

	@PostMapping()
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);

	}

	// get one employee by id
	@GetMapping("{empId}")
	public Employee getEmployee(@PathVariable("empId") int empId) {
		return employeeService.getEmployee(empId);
	}

	// delete employee by id
	@DeleteMapping("{id}")
	
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployeeById(id);
		return "Deleted Successfully....";
	}

	// update employee
	@PutMapping()  
	public Employee update(@RequestBody Employee employee)   {   
		return employeeService.update(employee);  
	}
}
