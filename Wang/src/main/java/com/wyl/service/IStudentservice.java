package com.wyl.service;

import java.util.ArrayList;

import com.wyl.beans.Student;

public interface IStudentservice {
	/**
	 * 
	 * @Description 根据id得到学生信息
	 * @param id
	 * @return
	 */
	ArrayList<Student> studentInfo(int id);
}
