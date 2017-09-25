package com.wyl.controller;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wyl.beans.Student;
import com.wyl.service.IStudent;

@Controller
@RequestMapping("/f")
public class Controll2 {
	@Resource
	IStudent istudent;
	
	@RequestMapping("/ff")
	@ResponseBody
	public ArrayList<Student> list() {
		return istudent.list();
	}
}
