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


	public final EmployeeService employeeService;

	@Autowired
	private EmployeeRepository repo;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.employeeRepo.findAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}


    @PostMapping("/add")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

	@PutMapping("/update/{id}")
		public void updateEmployee(@PathVariable int id, @RequestBody Employee updateEmployee) {
			Employee employee = repo.findById(id).get();
			employee.setEmployee_name(updateEmployee.getEmployee_name());
			employee.setEmployee_id(updateEmployee.getEmployee_id());
			employee.setEmployee_joined_date(updateEmployee.getEmployee_joined_date());
			employee.setEmployee_age(updateEmployee.getEmployee_age());
			employee.setEmployee_designation(updateEmployee.getEmployee_designation());
			employee.setEmployee_deprt(updateEmployee.getEmployee_deprt());
			employeeService.updateEmployee(employee);
		}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}


}
