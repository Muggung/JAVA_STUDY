package com.inheritance.vo.model;

public class Teacher extends Person {
	private String major;
	private String inCharge;
	
	public Teacher() {}

	public Teacher(String name, int age, char gender, String major, String inCharge) {
		super(name, age, gender);
		this.major = major;
		this.inCharge = inCharge;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getInCharge() {
		return inCharge;
	}

	public void setInCharge(String inCharge) {
		this.inCharge = inCharge;
	}
	
	@Override
	public String info() {
		return print() + " 전공과목 :" + major + " 담당과목 : " + inCharge;
	}
}
