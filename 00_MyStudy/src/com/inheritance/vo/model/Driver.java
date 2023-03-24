package com.inheritance.vo.model;

public class Driver extends Person {
	private String region;
	private int career;
	
	public Driver() {}

	public Driver(String name, int age, char gender, String region, int career) {
		super(name, age, gender);
		this.region = region;
		this.career = career;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	@Override
	public String info() {
		return print() + " 담당지역 :" + region + " 운전경력 : " + career;
	}
	
}
