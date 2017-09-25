package com.wyl.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyl.beans.Student;
import com.wyl.dao.StudentMapper;

@Service
public class StudentSerice implements IStudent {

	@Resource
	StudentMapper student;

	@Override
	public ArrayList<Student> list() {
		return student.selectByPrimaryKey();
	}

}
