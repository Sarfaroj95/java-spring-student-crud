package com.student.restapi.controller;

import com.student.restapi.entity.Employee;
import com.student.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/employees")
	public List<Employee> getAllTeachers(){
		List<Employee> teacher = repo.findAll();
		return teacher;
		
	}


    @PostMapping("/employees/add")
    public void createTeacher(@RequestBody Employee teacher) {

        repo.save(teacher);
    }

}
