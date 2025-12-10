package com.student.restapi.controller;

import com.student.restapi.entity.Employee;
import com.student.restapi.repository.EmployeeRepository;
import com.student.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> employeeList = repo.findAll();
		return employeeList;

	}


    @PostMapping("/add")
    public void createEmployee(@RequestBody Employee employee) {

        repo.save(employee);
    }

}
