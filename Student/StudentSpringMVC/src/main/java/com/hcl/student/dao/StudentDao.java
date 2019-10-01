package com.hcl.student.dao;

import java.util.List;

import com.hcl.student.model.Student;




public interface StudentDao {

	public void addStudent(Student employee);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer employeeId);

	public Student updateStudent(Student employee);

	public Student getStudent(int employeeid);
}

