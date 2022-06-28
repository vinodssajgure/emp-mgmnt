package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entitiy.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
