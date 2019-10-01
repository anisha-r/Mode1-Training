package com.jwt.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.service.ExamService;


@Controller("/exam")
public class ExamController {

	private static final Logger logger = Logger
			.getLogger(ExamController.class);

	public ExamController() {
		System.out.println("ExamController()");
	}

	@Autowired
	private  ExamService ExamService;

	@RequestMapping(value = "/")
	public ModelAndView listExam(ModelAndView model) throws IOException {
		
		List<Exam> listExam = ExamService.getAllExams();

		model.addObject("listExam", listExam);

		model.setViewName("home");

		return model;
	}

	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Exam Exam = new Exam();
		model.addObject("Exam", Exam);
		model.setViewName("ExamForm");
		return model;
	}

	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveExam(@ModelAttribute Exam Exam) {
		if (Exam.getExamId() == 0) { 
			ExamService.addExam(Exam);
		} else {
			ExamService.updateExam(Exam);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
	public ModelAndView deleteExam(HttpServletRequest request) {
		int ExamId = Integer.parseInt(request.getParameter("examId"));
		ExamService.deleteExam(ExamId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int ExamId = Integer.parseInt(request.getParameter("examId"));
		Exam exam = ExamService.getExam(ExamId);

		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("Exam", exam);

		return model;
	}
	
	

}