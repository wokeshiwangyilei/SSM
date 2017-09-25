package com.wyl.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyl.beans.Student;
import com.wyl.dao.StudentMapper;
@Service
public class StudentImp implements IStudentservice {
	@Resource
	private StudentMapper studentMapper;
	@Override
	public ArrayList<Student> studentInfo(int id) {
		return studentMapper.selectByPrimaryKey(id);
	}

}
