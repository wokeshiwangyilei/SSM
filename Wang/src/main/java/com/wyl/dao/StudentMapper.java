package com.wyl.dao;

import java.util.ArrayList;

import com.wyl.beans.Student;

public interface StudentMapper {

	/**
	 * 
	 * @Description 根据id得到学生信息
	 * @param id
	 * @return
	 */
	ArrayList<Student> selectByPrimaryKey(Integer id);

}