package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	public void saveEmployeeRecord(Employee employee) {
		employeeRepository.save(employee);
		
		
	}

}
