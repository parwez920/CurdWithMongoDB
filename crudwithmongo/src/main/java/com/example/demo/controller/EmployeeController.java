package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	public String saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployeeRecord(employee);
		return "employee object added";
	}

}
