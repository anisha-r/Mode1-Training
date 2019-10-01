package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;

@Repository
public class ExamDAOImpl implements ExamDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addExam(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Exam> getAllExams() {
		return sessionFactory.getCurrentSession().createQuery("from Exam")
				.list();
	}

	public Exam getExam(int examId) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, examId);
	}

	@Override
	public Exam updateExam(Exam exam) {
		sessionFactory.getCurrentSession().update(exam);
		return exam;
	}

	@Override
	public void deleteExam(Integer examId) {
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(
				Exam.class, examId);
		if (null != exam) {
			this.sessionFactory.getCurrentSession().delete(exam);
		
	}
	
	}	
}