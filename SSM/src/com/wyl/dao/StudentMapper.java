package com.wyl.dao;

import java.util.ArrayList;

import com.wyl.beans.Student;

public interface StudentMapper {

    ArrayList<Student> selectByPrimaryKey();
}