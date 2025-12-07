package com.student.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.restapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
