package com.hcl.full;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FullController {
	@RequestMapping("/full")
	public ModelAndView full(HttpServletRequest req,HttpServletResponse res){
		String a,b;
		String result="";
		a=req.getParameter("firstName");
		b=req.getParameter("secondName");
		result=a + " " +b;
		
	
		return new ModelAndView("result","result",result);
		
	}

}


