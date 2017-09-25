package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wyl.beans.Student;
import com.wyl.service.IStudentservice;

@Controller
public class control {
	@Resource
	private IStudentservice iStudentservice;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public ModelAndView add(int a) throws Exception {

		ModelAndView modelAndView = new ModelAndView("WEB-INF/index.jsp");
		ArrayList<Student> students=iStudentservice.studentInfo(a);
		modelAndView.addObject("mess",students);
		return modelAndView;
	}
}

