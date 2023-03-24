package com.inheritance.vo.model;

public class Employee extends Person {
	private String department;
	private String phone;
	
	public Employee() {}

	public Employee(String name, int age, char gender, String department, String phone) {
		super(name, age, gender);
		this.department = department;
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String info() {
		return print() + " 부서 :" + department + " 휴대폰 : " + phone;
	}
}
