package com.wyl.beans;

public class Course {
	private Integer csid;

	private String name;

	private Float credit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Float getCredit() {
		return credit;
	}

	public void setCredit(Float credit) {
		this.credit = credit;
	}

	public Integer getCsid() {
		return csid;
	}

	public void setCsid(Integer csid) {
		this.csid = csid;
	}
}