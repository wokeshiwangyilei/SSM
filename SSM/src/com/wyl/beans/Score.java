package com.wyl.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Score extends ScoreKey implements Serializable{
	private Integer score;

	private Course course;

	private Student student;

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}