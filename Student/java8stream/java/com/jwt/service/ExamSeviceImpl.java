 package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;

public class ExamSeviceImpl {
	
	@Autowired
	private ExamDAO ExamDAO;

	// @Override
	@Transactional
	public void addExam(Exam exam){
		ExamDAO.addExam(exam);
	}

	// @Override
	@Transactional
	public List<Exam> getAllExams() {
		return ExamDAO.getAllExams();
	}

  //  @Override
	@Transactional
	public void deleteExam(Integer examId) {
		ExamDAO.deleteExam(examId);
	}

	public Exam getExam(int empid) {
		return ExamDAO.getExam(empid);
	}

	public Exam updateExam(Exam exam) {
		return ExamDAO.updateExam(exam);
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.ExamDAO = examDAO;
	}


}
