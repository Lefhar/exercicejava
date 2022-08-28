package com.harold.springboot.service;

import java.util.List;

import com.harold.springboot.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);
}
