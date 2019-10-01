package com.jwt.service;

import java.util.List;

import com.jwt.model.Exam;

public interface ExamService {
	
	public void addExam(Exam exam);

	public List<Exam> getAllExams();
	
	public void deleteExam(Integer examId);
	
	public Exam getExam(int examId);

	public Exam updateExam(Exam exam);

}
