package com.hcl.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.student.model.Student;
import com.hcl.student.service.StudentManager;

@Controller

public class StudentController {
	
	@Autowired
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String home(Model model){
		model.addAttribute("student",new Student());
		return "addStudent";
	}

	@Autowired
	StudentManager sMgr;
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(Student student,Model model){
		sMgr.addStudent(student);
		return "studentSuccess";
	}
	
//	@RequestMapping(value="/getStudent",method=RequestMethod.POST)
//	public String getStudent(Model model){
//		model.addAttribute("student",new Student());
//		return "getStudent";
//	}
//
//	
//	@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
//	public String updateStudent(Model model){
//		return "updateStudent";
//	}
}
