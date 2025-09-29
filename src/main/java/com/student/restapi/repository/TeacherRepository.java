package com.student.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.restapi.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>  {

}
