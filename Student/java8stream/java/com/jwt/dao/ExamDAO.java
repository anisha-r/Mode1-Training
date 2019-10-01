package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;


public interface ExamDAO {
	
	public void addExam(Exam exam);
	
	public List<Exam> getAllExams();
	
	public Exam updateExam(Exam exam);
	
	public void deleteExam(Integer examId);
	
	public Exam getExam(int examId);

}
