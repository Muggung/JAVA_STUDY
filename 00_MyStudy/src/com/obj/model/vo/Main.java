package com.obj.model.vo;

public class Main {
	public static void main(String[] args) {
		// 1
		Employee s1 = new Employee("김땡땡", "강사부");
		Employee s2 = new Employee("이땅땅", "학생부");
		
		s1.academy();
		s2.academy();
		
		// 2
		People p1 = new People("01000000000", 180.5, 65.5);
		People p2 = new People("01099999999", 195.5, 100.5);
		
		p1.printPeople();
		p2.printPeople();
	}
}
