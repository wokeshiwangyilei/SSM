package com.wyl.beans;

public class Course {
	private Integer csid;

	private String name1;

	private Float credit;

	public String getName1() {
		return name1;
	}

	public void setName1(String name) {
		this.name1 = name == null ? null : name.trim();
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