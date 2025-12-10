package com.student.restapi.service;

import com.student.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    public final EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo){
        this.employeeRepo = employeeRepo;
    }

   public void getAllEmployees() {
        employeeRepo.findAll();
    }

    public void updateEmployee(com.student.restapi.entity.Employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
