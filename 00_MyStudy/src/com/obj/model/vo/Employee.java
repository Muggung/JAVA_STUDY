package com.obj.model.vo;

public class Employee {
	/*
	 * 1. 사원 클래스 만들기
	 * 2. 이름, 부서, 직책, 월급, 보너스가 있음
	 * 3-1. 이름, 부서는 외부패키지에서 수정, 접근 가능
	 * 3-2. 직책, 월급은 내부패키지에서 수정, 접근 가능
	 * 4. Main클래스를 생성하고 사원크래스 인스턴스 2개를 만든다.
	 * 5. 이름 부서는 "김땡땡" "강사부", "이땅땅" "학생부"로 등록하고 출력
	 */
	public String name;
	public String department;
	private String position;
	private int salary;
	
	Employee(){}
	
	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void academy() {
		if(this.department.equals("강사부")) {
			setPosition("강사");
			setSalary(500);
			System.out.println(this.name + " " + this.department + " " + getPosition() + " " + getSalary());
		} else if(this.department.equals("학생부")) {
			setPosition("수강생");
			setSalary(50);
			System.out.println(this.name + " " + this.department + " " + getPosition() + " " + getSalary());
		}
	}
}
