package com.obj.model.vo;

public class People {
	/*
	 * 1. 사람클래스를 만든다.
	 * 2. 이름, 주소, 전화번호, 키, 몸무게
	 * 3-1. 이름, 주소는 클래스 내부에서만 접근가능
	 * 3-2. 전화번호, 키, 몸무게는 외부패키지 접근가능
	 * 4. 두 개의 인스턴스 생성 후 01036446259 180.5 65.5, 01012345678 195.5 100.2 저장 후 출력
	 */
	
	private String name;
	private String address;
	public String phoneNum;
	public double height;
	public double weight;
	
	public People() {}
	
	public People(String phone, double height, double weight) {
		setName("사람");
		setAddress("대한민국");
		this.phoneNum = phone;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printPeople() {
		System.out.println(getName() + " " + getAddress() + " " + this.phoneNum + " " + this.height + " " + this.weight);
	}
}
