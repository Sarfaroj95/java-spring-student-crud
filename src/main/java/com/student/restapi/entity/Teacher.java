package com.student.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "employee_name")
	private String employee_name;
	@Column(name = "employee_id")
	private String employee_id;
	@Column(name = "employee_joined_date")
	private String employee_joined_date;
	@Column(name = "employee_age")
	private int employee_age;
	@Column(name = "employee_designation")
	private String employee_designation;
	@Column(name = "employee_deprt")
	private String employee_deprt;
	
	public Teacher() {
		
	}
	
	
	public Teacher(String employee_name, String employee_id, String employee_joined_date, int employee_age,
			String employee_designation, String employee_deprt) {
		super();
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.employee_joined_date = employee_joined_date;
		this.employee_age = employee_age;
		this.employee_designation = employee_designation;
		this.employee_deprt = employee_deprt;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_joined_date() {
		return employee_joined_date;
	}
	public void setEmployee_joined_date(String employee_joined_date) {
		this.employee_joined_date = employee_joined_date;
	}
	public int getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public String getEmployee_deprt() {
		return employee_deprt;
	}
	public void setEmployee_deprt(String employee_deprt) {
		this.employee_deprt = employee_deprt;
	}
	@Override
	public String toString() {
		return "Teacher [employee_name=" + employee_name + ", employee_id=" + employee_id + ", employee_joined_date="
				+ employee_joined_date + ", employee_age=" + employee_age + ", employee_designation="
				+ employee_designation + ", employee_deprt=" + employee_deprt + "]";
	}

}
