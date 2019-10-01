package com.hcl.student.service;

import java.util.List;

import com.hcl.student.model.Student;

public interface StudentManager {
	

	public String addStudent(Student student);
	public List<Student> getStudent(int rollNo);
	public void updateStudent(Student student);

}
