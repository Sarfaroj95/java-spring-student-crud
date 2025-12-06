package com.student.restapi.controller;

import java.util.List;

import com.student.restapi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.restapi.entity.Teacher;
import com.student.restapi.repository.TeacherRepository;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherRepository repo;
	
	@GetMapping("/teachers")
	public List<Teacher> getAllTeachers(){
		List<Teacher> teacher = repo.findAll();
		return teacher;
		
	}


    @PostMapping("/teachers/add")
    public void createTeacher(@RequestBody Teacher teacher) {

        repo.save(teacher);
    }

}
