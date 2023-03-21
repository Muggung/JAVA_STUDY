package com.inheritance.vo.model;

public class Student extends Person {
	private String subject;
	private int studentClass;
	
	public Student() {}

	public Student(String name, int age, char gender, String subject, int studentClass) {
		super(name, age, gender);
		this.subject = subject;
		this.studentClass = studentClass;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	
	@Override
	public String info() {
		return print() + " 과목 :" + subject + " 반 : " + studentClass;
	}
}
