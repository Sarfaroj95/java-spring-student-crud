package com.student.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.restapi.entity.Student;
import com.student.restapi.repository.StudentRepository;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		List<Student> students = repo.findAll();
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		return student;
	}
	
	
	@PostMapping("/students/add")
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PutMapping("/students/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student updateStudent) {
		Student student = repo.findById(id).get();
		student.setName(updateStudent.getName());
		student.setPercentage(updateStudent.getPercentage());
		student.setBranch(updateStudent.getBranch());
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
	
	

}
